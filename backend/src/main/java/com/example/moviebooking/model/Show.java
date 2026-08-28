package com.example.moviebooking.model;
import jakarta.persistence.*;
@Entity
public class Show {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private Long movieId; private String theatre; private String showDate; private String showTime;
 private int totalSeats; private int availableSeats; private double ticketPrice;
 public Show(){}
 public Long getId(){return id;} public Long getMovieId(){return movieId;} public void setMovieId(Long v){movieId=v;}
 public String getTheatre(){return theatre;} public void setTheatre(String v){theatre=v;} public String getShowDate(){return showDate;} public void setShowDate(String v){showDate=v;}
 public String getShowTime(){return showTime;} public void setShowTime(String v){showTime=v;} public int getTotalSeats(){return totalSeats;} public void setTotalSeats(int v){totalSeats=v;}
 public int getAvailableSeats(){return availableSeats;} public void setAvailableSeats(int v){availableSeats=v;} public double getTicketPrice(){return ticketPrice;} public void setTicketPrice(double v){ticketPrice=v;}
}
