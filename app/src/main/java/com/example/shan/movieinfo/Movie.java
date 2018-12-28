package com.example.shan.movieinfo;


import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private Integer year;
    private String director;
    public static List<Movie> items = new ArrayList<>();

    public static void generate() {
        items.add(new Movie("The Matrix", 1999, "Lana Wachowski, Lilly Wachowski"));
        items.add(new Movie("The Godfather ", 1972, "someone"));
        items.add(new Movie("The Godfather: Part II ", 1974, "someone"));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Movie(String title, Integer year) {
        this.title = title;
        this.year = year;
    }
    public Movie(String title, Integer year, String director) {
        this.title = title;
        this.year = year;
        this.director = director;
    }
}
