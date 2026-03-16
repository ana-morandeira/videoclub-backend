package org.videoclub.repository;

import org.videoclub.config.DBManager;
import org.videoclub.model.Movie;

import java.sql.Connection;
import java.sql.Statement;

public class MovieRepositoryImpl {

    private Connection connection;

    public void createMovie(Movie movie) {

        // Preparamos la consulta con todos los campos nuevos
        String querySQLCreate = "INSERT INTO movies (titulo, director, genero, argumento, imagen, imageCartel, trailer) " +
                "VALUES ('" + movie.getTitulo() + "', '" +
                movie.getDirector() + "', '" +
                movie.getGenero() + "', '" +
                movie.getArgumento() + "', '" +
                movie.getImagen() + "', '" +
                movie.getImageCartel() + "', '" +
                movie.getTrailer() + "')";

        try {
            connection = DBManager.initConnection(); // Conectar a la BBDD
            Statement statement = connection.createStatement(); // Preparar la sentencia
            statement.executeUpdate(querySQLCreate); // Ejecutar la sentencia
            System.out.println("Película Creada con éxito");

        } catch (Exception exception) {
            System.out.println("Error al crear la película: " + exception.getMessage());

        } finally {
            DBManager.closeConnection(); // Cerrar conexión siempre
        }
    }
}
