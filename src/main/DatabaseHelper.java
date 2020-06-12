package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHelper {

    private static final DatabaseHelper databaseHelper = new DatabaseHelper();

    private DatabaseHelper() {

    }

    public static DatabaseHelper getDatabaseHelper() {
        return databaseHelper;
    }

    public void executeSql(Connection connection, String sql) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
    }

    public ResultSet executeQuerySql(Connection connection, String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }
}