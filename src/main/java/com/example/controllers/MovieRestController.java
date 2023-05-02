package com.example.controllers;

import com.example.model.Movie;
import com.example.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(maxAge = 3600)
@RestController
public class MovieRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MovieRestController.class);

    @Autowired
    MovieService movieService;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/insertMovie", consumes = "application/json")
    public String saveMovie(@RequestBody Movie movie){
        LOGGER.info("***********saveMovie action called..");
        return movieService.insertMovie(movie);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/getMovie/{id}")
    public Movie getMovieById(@PathVariable String id){
        return movieService.getMovieById(id);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/getMovies", produces = "application/json")
    public ArrayList<Movie> getMovies(){
        LOGGER.info("***********getMovies action called..");
        return movieService.getMovies();
    }

//    @CrossOrigin(origins = "*")
//    @PutMapping(path = "/updateMovie", consumes = "application/json")
//    public String saveOrUpdate(@RequestBody Movie movie){
//        LOGGER.info("************updateMovie action called..");
//        return movieService.updateMovie(movie);
//    }
//
//    @CrossOrigin(origins = "*")
//    @DeleteMapping(path = "/deleteMovie/{id}")
//    public String deleteMovieById(@PathVariable String id){
//        LOGGER.info("************deleteMovies action called..");
//        return movieService.deleteMovieById(id);
//    }

    @GetMapping("/welcome")
    public String getWelcomeMsg(){
        LOGGER.info("getWelcomeMsg action called..");
        return movieService.welcomeMsg();
    }
}
