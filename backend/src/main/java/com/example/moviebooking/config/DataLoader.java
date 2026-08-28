package com.example.moviebooking.config;
import com.example.moviebooking.model.*; import com.example.moviebooking.repository.*; import org.springframework.boot.CommandLineRunner; import org.springframework.context.annotation.Bean; import org.springframework.context.annotation.Configuration;
@Configuration
public class DataLoader {
 @Bean CommandLineRunner load(MovieRepository movies, ShowRepository shows){
  return args -> { if(movies.count()==0){ Movie m1=movies.save(new Movie("Avengers: Endgame","Action",181,"English")); Movie m2=movies.save(new Movie("3 Idiots","Comedy",170,"Hindi"));
   if(shows.count()==0){ Show s1=new Show(); s1.setMovieId(m1.getId());s1.setTheatre("PVR City Mall");s1.setShowDate("2026-08-30");s1.setShowTime("18:30");s1.setTotalSeats(100);s1.setAvailableSeats(100);s1.setTicketPrice(220);shows.save(s1);
    Show s2=new Show(); s2.setMovieId(m2.getId());s2.setTheatre("INOX Central");s2.setShowDate("2026-08-30");s2.setShowTime("20:00");s2.setTotalSeats(80);s2.setAvailableSeats(80);s2.setTicketPrice(180);shows.save(s2); }
  }}; }
}
