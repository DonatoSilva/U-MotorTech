package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public static List<Map<String, Object>> fetchData(String DATABASE, String query) {
        List<Map<String, Object>> resultList = new ArrayList<>();
        try (Connection connection = getConnection(DATABASE)) {
            if (connection == null) {
                System.out.println("Error al obtener la conexión a la base de datos.");
                return null;
            }

            try (Statement statement = connection.createStatement()) {
                ResultSet resultSet = statement.executeQuery(query);
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();
                
                while (resultSet.next()) {
                    Map<String, Object> row = new HashMap<>();
                    for (int i = 1; i <= columnCount; i++) {
                        row.put(metaData.getColumnName(i), resultSet.getObject(i));
                    }
                    resultList.add(row);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al ejecutar el query: " + e.getMessage());
        }

        return resultList;
    }

    public static boolean executeQuery(String DATABASE, String query) {
        try (Connection connection = getConnection(DATABASE)) {
            if (connection == null) {
                System.out.println("Error al obtener la conexión a la base de datos.");
                return false;
            }

            try (Statement statement = connection.createStatement()) {
                int result = statement.executeUpdate(query);
                return result > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al ejecutar el query: " + e.getMessage());
            return false;
        }
    }
}
