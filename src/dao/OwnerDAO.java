package dao;

import database.ListQuery;
import database.MyConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import motortech.Owner;

public class OwnerDAO {

    private final static String DATABASE = "MotorTechDB";

    public List<Owner> getAllOwners() {
        List<Owner> owners = new ArrayList<>();
        Map<String, String> Querys = ListQuery.getListQuery();
        List<Map<String, Object>> resultList = MyConnection.fetchData(DATABASE, Querys.get("AllOwners"));
        if (resultList.isEmpty()) {
            System.err.println("No se tienen propietarios registrados");
            return owners;
        }
        for (Map<String, Object> ownerResult : resultList) {
            Owner owner = new Owner();
            owner.setCedula((int) ownerResult.get("Cedula"));
            owner.setNombresApellidos((String) ownerResult.get("NombresApellidos"));
            owner.setDireccion((String) ownerResult.get("Direccion"));
            owner.setTelefono((String) ownerResult.get("Telefono"));
            owner.setCorreoElectronico((String) ownerResult.get("CorreoElectronico"));
            owners.add(owner);
        }
        return owners;
    }

    public Owner getOwner(int cedula) {
        Owner owner = new Owner();
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("GetOwnerByCedula"))) {
            preparedStatement.setInt(1, cedula);
            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            List<Map<String, Object>> resultList = MyConnection.fetchData(DATABASE, query);
            if (resultList.isEmpty()) {
                System.out.println("No se encontró propietario con cédula: " + cedula);
                return owner;
            }
            Map<String, Object> ownerResult = resultList.get(0);
            owner.setCedula((int) ownerResult.get("Cedula"));
            owner.setNombresApellidos((String) ownerResult.get("NombresApellidos"));
            owner.setDireccion((String) ownerResult.get("Direccion"));
            owner.setTelefono((String) ownerResult.get("Telefono"));
            owner.setCorreoElectronico((String) ownerResult.get("CorreoElectronico"));
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al buscar el propietario " + cedula + ": " + e.getMessage());
        }
        return owner;
    }
    
    public List<Owner> getOwners(int cedula) {
        List<Owner> owners = new ArrayList<>();
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE);
             PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("GetOwnersByCedula"))) {

            preparedStatement.setInt(1, cedula);
            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            List<Map<String, Object>> resultList = MyConnection.fetchData(DATABASE, query);

            if (resultList.isEmpty()) {
                System.out.println("No se encontraron propietarios con la cédula: " + cedula);
                return owners;
            }

            for (Map<String, Object> ownerResult : resultList) {
                Owner owner = new Owner();
                owner.setCedula((Integer) ownerResult.get("Cedula"));
                owner.setNombresApellidos((String) ownerResult.get("NombresApellidos"));
                owner.setDireccion((String) ownerResult.get("Direccion"));
                owner.setTelefono((String) ownerResult.get("Telefono"));
                owner.setCorreoElectronico((String) ownerResult.get("CorreoElectronico"));
                owners.add(owner);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al buscar propietarios con la cédula " + cedula + ": " + e.getMessage());
        }
        return owners;
    }

    public boolean deleteOwner(int cedula) {
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("DeleteOwner"))) {
            preparedStatement.setInt(1, cedula);
            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al eliminar el propietario: " + e.getMessage());
            return false;
        }
    }
    
    public boolean createOwner(Owner owner) {
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("InsertOwner"))) {
            preparedStatement.setInt(1, owner.getCedula());
            preparedStatement.setString(2, owner.getNombresApellidos());
            preparedStatement.setString(3, owner.getDireccion());
            preparedStatement.setString(4, owner.getTelefono());
            preparedStatement.setString(5, owner.getCorreoElectronico());
            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar el propietario: " + e.getMessage());
            return false;
        }
    }

    public boolean updateOwner(Owner owner) {
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE);
             PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("UpdateOwner"))) {

            preparedStatement.setString(1, owner.getNombresApellidos());
            preparedStatement.setString(2, owner.getDireccion());
            preparedStatement.setString(3, owner.getTelefono());
            preparedStatement.setString(4, owner.getCorreoElectronico());
            preparedStatement.setInt(5, owner.getCedula());

            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar el propietario: " + e.getMessage());
            return false;
        }
    }

}
