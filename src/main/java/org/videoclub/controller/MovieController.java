package org.videoclub.controller;

import org.videoclub.model.Movie;
import org.videoclub.repository.MovieRepositoryImpl;

public class MovieController {

    private MovieRepositoryImpl movieRepository;

    // Constructor que recibe el repositorio (Inyección de dependencia)
    public MovieController(MovieRepositoryImpl movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void createMovieController(Movie movie) {
        movieRepository.createMovie(movie);
    }
}
