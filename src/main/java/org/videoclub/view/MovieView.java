package org.videoclub.view;

import org.videoclub.model.Movie;
import java.util.List;

public class MovieView {

    // Método para mostrar los detalles de una sola película
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

    // Método para mostrar un mensaje de éxito o error
    public void displayMessage(String message) {
        System.out.println("MENSAJE DEL SISTEMA: " + message);
    }

    // Si más adelante haces un listado de todas las pelis:
    public void displayAllMovies(List<Movie> movies) {
        System.out.println("========== LISTADO DE CATÁLOGO ==========");
        for (Movie movie : movies) {
            System.out.println(movie.getTitulo() + " (" + movie.getDirector() + ")");
        }
        System.out.println("=========================================");
    }
}
