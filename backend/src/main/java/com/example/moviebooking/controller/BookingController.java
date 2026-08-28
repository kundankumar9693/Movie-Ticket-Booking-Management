package com.example.moviebooking.controller;
import com.example.moviebooking.model.*; import com.example.moviebooking.repository.*; import org.springframework.http.*;
import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/bookings") @CrossOrigin
public class BookingController {
 private final BookingRepository bookings; private final ShowRepository shows;
 public BookingController(BookingRepository b,ShowRepository s){bookings=b;shows=s;}
 @GetMapping public List<Booking> all(){return bookings.findAll();}
 @PostMapping public ResponseEntity<?> book(@RequestBody Booking b){
   Optional<Show> opt=shows.findById(b.getShowId());
   if(opt.isEmpty()) return ResponseEntity.badRequest().body("Show not found");
   Show s=opt.get();
   if(b.getSeats()<1 || b.getSeats()>s.getAvailableSeats()) return ResponseEntity.badRequest().body("Not enough seats available");
   b.setTotalCost(b.getSeats()*s.getTicketPrice()); b.setStatus("CONFIRMED");
   s.setAvailableSeats(s.getAvailableSeats()-b.getSeats()); shows.save(s); return ResponseEntity.ok(bookings.save(b));
 }
 @GetMapping("/{id}") public ResponseEntity<?> one(@PathVariable Long id){return bookings.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
}
