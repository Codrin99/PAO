package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConfiguration {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/proiect";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    private static Connection databaseConnection;

    private DatabaseConfiguration() {
    }

    public static Connection getDatabaseConnection() {
        try {
            if (databaseConnection == null || databaseConnection.isClosed()) {
                Class.forName("org.sqlite.JDBC");
                databaseConnection = DriverManager.getConnection("jdbc:sqlite:D:\\baza_de_date.db");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return databaseConnection;
    }

    public static void closeDatabaseConnection() {
        try {
            if (databaseConnection != null && !databaseConnection.isClosed()) {
                databaseConnection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}