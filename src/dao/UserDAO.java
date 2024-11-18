package dao;

import database.ListQuery;
import database.MyConnection;
import database.PasswordUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import motortech.User;

public class UserDAO {

    private final static String DATABASE = "MotorTechDB";

    public int verifyUser(String user, String password) {

        Map<String, String> Querys = ListQuery.getListQuery();

        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("GetHashesLogin"))) {

            preparedStatement.setString(1, user);
            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            List<Map<String, Object>> resultList = MyConnection.fetchData(DATABASE, query);
            if (resultList.isEmpty()) {
                System.out.println("El usuario no existe");
                return 404;
            }
            Map<String, Object> res = resultList.get(0);
            String hashes = res.get("Contrasena").toString();
            boolean isValidate = PasswordUtil.checkPassword(password, hashes);
            if (isValidate) {
                return 200;
            }
            return 401;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al verificar el usuario: " + e.getMessage());
            return 505;
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        Map<String, String> Querys = ListQuery.getListQuery();

        List<Map<String, Object>> resultList = MyConnection.fetchData(DATABASE, Querys.get("AllUsers"));

        if (resultList.isEmpty()) {
            System.err.println("No se tienen usuarios registrados");
            return users;
        }

        for (Map<String, Object> userResult : resultList) {
            User user = new User();
            user.setNombresApellidos((String) userResult.get("NombresApellidos"));
            user.setUsuario((String) userResult.get("Usuario"));
            user.setCorreoElectronico((String) userResult.get("CorreoElectronico"));
            user.setTelefono((String) userResult.get("Telefono"));

            users.add(user);
        }

        return users;
    }

    public User getUser(String telefono) {
        User user = new User();
        Map<String, String> Querys = ListQuery.getListQuery();

        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("GetUserByPhone"))) {

            preparedStatement.setString(1, telefono);

            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);

            List<Map<String, Object>> resultList = MyConnection.fetchData(DATABASE, query);

            if (resultList.isEmpty()) {
                System.out.println("No se encontro usuario con telefono: " + telefono);
                return user;
            }

            Map<String, Object> userResult = resultList.getFirst();

            user.setNombresApellidos((String) userResult.get("NombresApellidos"));
            user.setUsuario((String) userResult.get("Usuario"));
            user.setCorreoElectronico((String) userResult.get("CorreoElectronico"));
            user.setTelefono((String) userResult.get("Telefono"));
            user.setContrasena((String) userResult.get("Contrasena"));

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al buscar el usuario " + telefono + ": " + e.getMessage());
        }

        return user;
    }

    public List<User> getUsers(String telefono) {
        List<User> users = new ArrayList<>();
        Map<String, String> Querys = ListQuery.getListQuery();

        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("GetUsersByPhone"))) {

            preparedStatement.setString(1, telefono + "%");

            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);

            List<Map<String, Object>> resultList = MyConnection.fetchData(DATABASE, query);

            if (resultList.isEmpty()) {
                System.out.println("No se encontraron usuarios con telefono: " + telefono);
                return users;
            }

            for (Map<String, Object> userResult : resultList) {
                User user = new User();
                user.setNombresApellidos((String) userResult.get("NombresApellidos"));
                user.setUsuario((String) userResult.get("Usuario"));
                user.setCorreoElectronico((String) userResult.get("CorreoElectronico"));
                user.setTelefono((String) userResult.get("Telefono"));

                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al buscar el usuario " + telefono + ": " + e.getMessage());
        }

        return users;
    }

    public boolean deleteUser(String telefono) {
        Map<String, String> Querys = ListQuery.getListQuery();

        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("DeleteUser"))) {

            preparedStatement.setString(1, telefono);

            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);

            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al eliminar el usuario: " + e.getMessage());
            return false;
        }
    }

    public boolean createUser(User user) {
        Map<String, String> Querys = ListQuery.getListQuery();

        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("InsertUser"))) {

            String pass = PasswordUtil.hashPassword(user.getContrasena());

            preparedStatement.setString(1, user.getTelefono());
            preparedStatement.setString(2, user.getUsuario());
            preparedStatement.setString(3, user.getNombresApellidos());
            preparedStatement.setString(4, user.getCorreoElectronico());
            preparedStatement.setString(5, pass);

            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);

            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar el usuario: " + e.getMessage());
            return false;
        }
    }

    public boolean updateUser(User user) {
        Map<String, String> Querys = ListQuery.getListQuery();

        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("UpdateUser"))) {

            preparedStatement.setString(1, user.getUsuario());
            preparedStatement.setString(2, user.getNombresApellidos());
            preparedStatement.setString(3, user.getCorreoElectronico());
            preparedStatement.setString(4, user.getContrasena());
            preparedStatement.setString(5, user.getTelefono());

            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);

            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar el usuario: " + e.getMessage());
            return false;
        }
    }
}
