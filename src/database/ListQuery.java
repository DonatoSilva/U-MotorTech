package database;

import java.util.HashMap;
import java.util.Map;

public class ListQuery {
    public static Map<String, String> getListQuery() {
        // Definir las consultas como cadenas de texto
        String propietariosQuery = "CREATE TABLE Propietarios ("
                + "Cedula INT PRIMARY KEY, "
                + "NombresApellidos VARCHAR(100) NOT NULL, "
                + "NumeroTarjetaPropiedad VARCHAR(50) NOT NULL, "
                + "Direccion VARCHAR(150) NOT NULL, "
                + "Telefono VARCHAR(20) NOT NULL, "
                + "CorreoElectronico VARCHAR(100))";

        String vehiculosQuery = "CREATE TABLE Vehiculos ("
                + "Placa VARCHAR(10) PRIMARY KEY, "
                + "TarjetaPropiedad VARCHAR(50) NOT NULL, "
                + "TipoVehiculo ENUM('Automóvil', 'Camioneta') NOT NULL, "
                + "PropietarioID INT, "
                + "FOREIGN KEY (PropietarioID) REFERENCES Propietarios(Cedula))";

        String usuariosQuery = "CREATE TABLE Usuarios ("
                + "Telefono VARCHAR(20) PRIMARY KEY, "
                + "Usuario VARCHAR(20) UNIQUE NOT NULL, "
                + "NombresApellidos VARCHAR(100) NOT NULL, "
                + "CorreoElectronico VARCHAR(100) NOT NULL, "
                + "Contrasena VARCHAR(50) NOT NULL)";

        String serviciosQuery = "CREATE TABLE Servicios ("
                + "IdServicio INT PRIMARY KEY AUTO_INCREMENT, "
                + "FechaIngreso TIMESTAMP DEFAULT CURRENT_TIMESTAMP, "
                + "FechaEntrega DATE, "
                + "CostoManoObra DECIMAL(10, 2), "
                + "CostoRepuestos DECIMAL(10, 2), "
                + "HorasTrabajo INT, "
                + "PropietarioID INT, "
                + "VehiculoPlaca VARCHAR(10), "
                + "EstadoVehiculo VARCHAR(10), "
                + "MotivoIngreso VARCHAR(255), "
                + "EstadoServicio VARCHAR(50), "
                + "UsuarioID VARCHAR(20), "
                + "FOREIGN KEY (PropietarioID) REFERENCES Propietarios(Cedula), "
                + "FOREIGN KEY (VehiculoPlaca) REFERENCES Vehiculos(Placa), "
                + "FOREIGN KEY (UsuarioID) REFERENCES Usuarios(Telefono))";
        
        String allUsersQuery = "SELECT * FROM Usuarios";
        String deleteUserQuery = "DELETE FROM Usuarios WHERE Telefono = ?";
        String insertUserQuery = "INSERT INTO Usuarios (Telefono, Usuario, NombresApellidos, CorreoElectronico, Contrasena) VALUES (?, ?, ?, ?, ?)";
        String updateUserQuery = "UPDATE Usuarios SET Usuario = ?, NombresApellidos = ?, CorreoElectronico = ?, Contrasena = ? WHERE Telefono = ?";
        String getUserByPhoneQuery = "SELECT * FROM Usuarios WHERE Telefono = ?";
        String getUsersByPhoneQuery = "SELECT * FROM Usuarios WHERE Telefono LIKE ?";
        
         String isLogin = "SELECT * FROM Usuarios WHERE Usuario = ? AND Contrasena = ?";
        
        // Crear el diccionario y almacenar las consultas
        Map<String, String> listQuery = new HashMap<>();
        
        listQuery.put("Propietarios", propietariosQuery);
        listQuery.put("Vehiculos", vehiculosQuery);
        listQuery.put("Usuarios", usuariosQuery);
        listQuery.put("Servicios", serviciosQuery);
        
        listQuery.put("AllUsers", allUsersQuery);
        listQuery.put("DeleteUser", deleteUserQuery);
        listQuery.put("InsertUser", insertUserQuery);
        listQuery.put("UpdateUser", updateUserQuery);
        listQuery.put("GetUserByPhone", getUserByPhoneQuery);
        listQuery.put("GetUsersByPhone", getUsersByPhoneQuery);
        
        listQuery.put("IsLogin", isLogin);
        
        return listQuery;
    }
}
