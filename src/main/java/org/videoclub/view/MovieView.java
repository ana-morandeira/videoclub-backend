package org.videoclub.view;

import org.videoclub.model.Movie;
import java.util.List;

public class MovieView {

    public void displayMovieDetails(Movie movie) {
        System.out.println("------- DETALLES DE LA PELÍCULA -------");
        System.out.println("ID: " + movie.getId());
        System.out.println("Título: " + movie.getTitulo());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Género: " + movie.getGenero());
        System.out.println("Argumento: " + movie.getArgumento());
        System.out.println("Tráiler: " + movie.getTrailer());
        System.out.println("---------------------------------------");
    }

    public void displayMessage(String message) {
        System.out.println("MENSAJE DEL SISTEMA: " + message);
    }

    public void displayAllMovies(List<Movie> movies) {
        System.out.println("========== LISTADO DE CATÁLOGO ==========");
        for (Movie movie : movies) {
            System.out.println(movie.getTitulo() + " (" + movie.getDirector() + ")");
        }
        System.out.println("=========================================");
    }
}
