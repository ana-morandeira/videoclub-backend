package org.videoclub.controller;

import org.videoclub.model.Movie;
import org.videoclub.repository.MovieRepositoryImpl;

public class MovieController {

    private MovieRepositoryImpl movieRepository;

    // 1. Asegúrate de que el constructor sea PUBLIC
    public MovieController(MovieRepositoryImpl movieRepository) {
        this.movieRepository = movieRepository;
    }

    // 2. Asegúrate de que el método sea PUBLIC y se llame EXACTAMENTE así
    public void createMovieController(Movie movie) {
        if (movieRepository != null) {
            movieRepository.createMovie(movie);
        } else {
            System.out.println("Error: El repositorio no está inicializado.");
        }
    }
}