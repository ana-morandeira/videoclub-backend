package org.videoclub.config; // 1. Paquete actualizado

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

    // 2. URL actualizada con el nombre de tu base de datos actual
    private static final String URL = "jdbc:mysql://localhost:3306/movies_app";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static Connection connection;

    public static Connection initConnection() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión a la BBDD exitosa");

        } catch (SQLException exception) {
            System.out.println("Conexión fallida: " + exception.getMessage());
        }

        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) { // Seguridad extra
                connection.close();
                System.out.println("Conexión cerrada con Éxito");
            }
        } catch (SQLException exception) {
            System.out.println("Error al cerrar la BBDD: " + exception.getMessage());
        }
    }
}