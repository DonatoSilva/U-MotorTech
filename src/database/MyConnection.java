package database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

class MyConnection {
    private static final String HOST = "jdbc:mysql://localhost:3306/";
    private static final String USER = "";
    private static final String PASSWORD = "";

    public static Connection getConnection(String DATABASE) throws SQLException {
        final String URL = HOST + DATABASE;
        return (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
