package com.example.moviebooking.controller;
import com.example.moviebooking.model.Movie; import com.example.moviebooking.repository.MovieRepository; import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/movies") @CrossOrigin
public class MovieController {
 private final MovieRepository repo; public MovieController(MovieRepository repo){this.repo=repo;}
 @GetMapping public List<Movie> all(){return repo.findAll();}
 @PostMapping public Movie add(@RequestBody Movie m){return repo.save(m);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){repo.deleteById(id);}
}
