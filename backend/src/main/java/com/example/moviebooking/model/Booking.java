package com.example.moviebooking.model;
import jakarta.persistence.*;
@Entity
public class Booking {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private Long showId; private String customerName; private String email; private int seats; private double totalCost; private String status;
 public Booking(){}
 public Long getId(){return id;} public Long getShowId(){return showId;} public void setShowId(Long v){showId=v;}
 public String getCustomerName(){return customerName;} public void setCustomerName(String v){customerName=v;} public String getEmail(){return email;} public void setEmail(String v){email=v;}
 public int getSeats(){return seats;} public void setSeats(int v){seats=v;} public double getTotalCost(){return totalCost;} public void setTotalCost(double v){totalCost=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
}
