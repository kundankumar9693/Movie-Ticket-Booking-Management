package com.example.moviebooking.controller;
import com.example.moviebooking.model.Show; import com.example.moviebooking.repository.ShowRepository; import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/shows") @CrossOrigin
public class ShowController {
 private final ShowRepository repo; public ShowController(ShowRepository repo){this.repo=repo;}
 @GetMapping public List<Show> all(){return repo.findAll();}
 @GetMapping("/movie/{movieId}") public List<Show> byMovie(@PathVariable Long movieId){return repo.findByMovieId(movieId);}
 @PostMapping public Show add(@RequestBody Show s){if(s.getAvailableSeats()==0)s.setAvailableSeats(s.getTotalSeats()); return repo.save(s);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){repo.deleteById(id);}
}
