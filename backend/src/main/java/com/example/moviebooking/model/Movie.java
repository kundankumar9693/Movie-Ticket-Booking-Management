package com.example.moviebooking.model;
import jakarta.persistence.*;
@Entity
public class Movie {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String title; private String genre; private int duration; private String language;
 public Movie() {}
 public Movie(String title,String genre,int duration,String language){this.title=title;this.genre=genre;this.duration=duration;this.language=language;}
 public Long getId(){return id;} public String getTitle(){return title;} public void setTitle(String v){title=v;}
 public String getGenre(){return genre;} public void setGenre(String v){genre=v;} public int getDuration(){return duration;} public void setDuration(int v){duration=v;}
 public String getLanguage(){return language;} public void setLanguage(String v){language=v;}
}
