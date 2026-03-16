package org.videoclub;

import org.videoclub.model.Movie;
import org.videoclub.repository.MovieRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        MovieRepositoryImpl movieRepository = new MovieRepositoryImpl();

        // --- PELÍCULAS DE ARGENTINA ---
        Movie movie2 = new Movie(0, "El secreto de sus ojos", "Juan José Campanella", "Thriller",
                "Un oficial busca resolver un crimen del pasado.",
                "src/assets/images/argentina/elSecretoDeSusOjos.jpg",
                "src/assets/images/argentina/elSecretoDeSusOjosCartel.jpg",
                "https://youtu.be/hKa8U-8vsfU");

        Movie movie3 = new Movie(0, "Nueve reinas", "Fabián Bielinsky", "Crimen, Suspenso",
                "Dos estafadores planean un gran golpe.",
                "src/assets/images/argentina/nueveReinas.jpg",
                "src/assets/images/argentina/nueveReinasCartel.jpg",
                "https://youtu.be/Awu9WonTVB0");

        // --- PELÍCULAS DE MÉXICO ---
        Movie movie9 = new Movie(0, "Biutiful", "Alejandro G. Iñárritu", "Drama",
                "Un hombre lucha por asegurar el futuro de sus hijos.",
                "src/assets/images/mexico/biutiful.jpg",
                "src/assets/images/mexico/biutifulCartel.jpg",
                "https://youtu.be/3WzJcwGA6YM");

        // --- INSERTAR EN LA BASE DE DATOS ---
        // Descomenta las líneas de abajo una a una para ir poblando tu BBDD
        movieRepository.createMovie(movie2);
        movieRepository.createMovie(movie3);
        movieRepository.createMovie(movie9);

        System.out.println("Inserción completada.");
    }
}