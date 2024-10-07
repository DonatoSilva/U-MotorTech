package database;

import database.ListQuery;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Map;

public class MyConnection {

    private static final String HOST = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection(String DATABASE) throws SQLException {
        final String URL = HOST + DATABASE;
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static boolean setupDatabase(String DATABASE) {
        try (Connection connection = getConnection("information_schema"); Statement statement = connection.createStatement()) {
            String query = "SELECT SCHEMA_NAME FROM SCHEMATA WHERE SCHEMA_NAME = '" + DATABASE + "'";
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                return true;
            } else {
                statement.executeUpdate("CREATE DATABASE " + DATABASE);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al verificar o crear la base de datos: " + e.getMessage());
            return false;
        }
    }

    public static boolean setupTables(String DATABASE) {
        Map<String, String> Querys = ListQuery.getListQuery();

        boolean status = true;

        // Crear tablas independientes primero
        status = status && setupTable(DATABASE, "Propietarios", Querys.get("Propietarios"));
        status = status && setupTable(DATABASE, "Vehiculos", Querys.get("Vehiculos"));
        status = status && setupTable(DATABASE, "Usuarios", Querys.get("Usuarios"));

        // Crear tabla dependiente después
        status = status && setupTable(DATABASE, "Servicios", Querys.get("Servicios"));

        return status;
    }

    public static boolean setupTable(String DATABASE, String TABLE, String QUERYCREATE) {
        final String URL = HOST + DATABASE;

        try (Connection connection = getConnection(DATABASE)) {
            if (connection != null && !connection.isClosed()) {
                try (Statement statement = connection.createStatement()) {
                    String query = "SHOW TABLES LIKE '" + TABLE + "'";
                    ResultSet resultSet = statement.executeQuery(query);

                    if (resultSet.next()) {
                        return true;
                    } else {
                        statement.execute(QUERYCREATE);

                        return true;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al verificar o crear la tabla" + TABLE + ": " + e.getMessage());
        }

        return false;
    }
}
