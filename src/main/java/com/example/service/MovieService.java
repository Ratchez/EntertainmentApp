package com.example.service;

import com.example.model.Movie;

import java.util.ArrayList;

public interface MovieService {

    String welcomeMsg();
    public ArrayList<Movie> getMovies();
    public Movie getMovieById(String id);
    public String insertMovie(Movie movie);
//    public String updateMovie(Movie movie);
//    public String deleteMovieById(String id);
}
