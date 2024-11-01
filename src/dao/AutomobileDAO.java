package dao;

import database.ListQuery;
import database.MyConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import motortech.Automobile;

public class AutomobileDAO {

    private final static String DATABASE = "MotorTechDB";

    public Automobile getAutomobile(String placa) {
        Automobile automobile = new Automobile();
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("GetAutomobile"))) {
            preparedStatement.setString(1, placa);
            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            List<Map<String, Object>> resultList = MyConnection.fetchData(DATABASE, query);
            if (resultList.isEmpty()) {
                System.out.println("No se encontró vehículo con placa: " + placa);
                return automobile;
            }
            Map<String, Object> automobileResult = resultList.get(0);
            automobile.setPlaca((String) automobileResult.get("Placa"));
            automobile.setTarjetaPropiedad((String) automobileResult.get("TarjetaPropiedad"));
            automobile.setTipoVehiculo((String) automobileResult.get("TipoVehiculo"));
            automobile.setPropietarioID((Integer) automobileResult.get("PropietarioID"));
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al buscar el vehículo " + placa + ": " + e.getMessage());
        }
        return automobile;
    }

    public List<Automobile> getAllAutomobiles(int IdCard) {
        List<Automobile> automobiles = new ArrayList<>();
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("AllAutomobilesByOwnerID"))) {
            preparedStatement.setInt(1, IdCard);
            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            List<Map<String, Object>> resultList = MyConnection.fetchData(DATABASE, query);
            if (resultList.isEmpty()) {
                System.err.println("No se encontraron vehículos para el propietario con ID: " + IdCard);
                return automobiles;
            }
            for (Map<String, Object> automobileResult : resultList) {
                Automobile automobile = new Automobile();
                automobile.setPlaca((String) automobileResult.get("Placa"));
                automobile.setTarjetaPropiedad((String) automobileResult.get("TarjetaPropiedad"));
                automobile.setTipoVehiculo((String) automobileResult.get("TipoVehiculo"));
                automobile.setPropietarioID((Integer) automobileResult.get("PropietarioID"));
                automobiles.add(automobile);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al buscar vehículos para el propietario con ID: " + IdCard + ": " + e.getMessage());
        }
        return automobiles;
    }

    public boolean createAutomobile(Automobile automobile) {
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("InsertAutomobile"))) {
            preparedStatement.setString(1, automobile.getPlaca());
            preparedStatement.setString(2, automobile.getTarjetaPropiedad());
            preparedStatement.setString(3, automobile.getTipoVehiculo());
            preparedStatement.setInt(4, automobile.getPropietarioID());
            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar el vehículo: " + e.getMessage());
            return false;
        }
    }

    public boolean updateAutomobile(Automobile automobile) {
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("UpdateAutomobile"))) {
            preparedStatement.setString(1, automobile.getTarjetaPropiedad());
            preparedStatement.setString(2, automobile.getTipoVehiculo());
            preparedStatement.setInt(3, automobile.getPropietarioID());
            preparedStatement.setString(4, automobile.getPlaca());
            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar el vehículo: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteAutomobile(String placa) {
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("DeleteAutomobile"))) {
            preparedStatement.setString(1, placa);
            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al eliminar el vehículo: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteAutomobiles(int IdCard) {
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("DeleteAutomobiles"))) {
            preparedStatement.setInt(1, IdCard);
            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al eliminar los vehiculos: " + e.getMessage());
            return false;
        }
    }
}
