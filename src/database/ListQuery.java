package database;

import java.util.HashMap;
import java.util.Map;

public class ListQuery {
    public static Map<String, String> getListQuery() {
        // Definir las consultas como cadenas de texto
        String propietariosQuery = "CREATE TABLE Propietarios ("
                + "Cedula INT PRIMARY KEY, "
                + "NombresApellidos VARCHAR(100) NOT NULL, "
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
                + "EstadoVehiculo VARCHAR(20), "
                + "MotivoIngreso TEXT, "
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
        
        String allOwnersQuery = "SELECT * FROM Propietarios";
        String deleteOwnerQuery = "DELETE FROM Propietarios WHERE Cedula = ?";
        String insertOwnerQuery = "INSERT INTO Propietarios (Cedula, NombresApellidos, Direccion, Telefono, CorreoElectronico) VALUES (?, ?, ?, ?, ?)";
        String updateOwnerQuery = "UPDATE Propietarios SET NombresApellidos = ?, Direccion = ?, Telefono = ?, CorreoElectronico = ? WHERE Cedula = ?";
        String getOwnerByCedulaQuery = "SELECT * FROM Propietarios WHERE Cedula = ?";
        String getOwnersByCedulaQuery = "SELECT * FROM Propietarios WHERE Cedula LIKE ?";
        
        String insertAutomobileQuery = "INSERT INTO Vehiculos (Placa, TarjetaPropiedad, TipoVehiculo, PropietarioID) VALUES (?, ?, ?, ?)";
        String updateAutomobileQuery = "UPDATE Vehiculos SET TarjetaPropiedad = ?, TipoVehiculo = ?, PropietarioID = ? WHERE Placa = ?";
        String deleteAutomobilesQuery = "DELETE FROM Vehiculos WHERE PropietarioID = ?;";
        String deleteAutomobileQuery = "DELETE FROM Vehiculos WHERE Placa = ?";
        String getAutomobileByPlacaQuery = "SELECT * FROM Vehiculos WHERE Placa = ?";
        String allAutomobilesByOwnerIDQuery = "SELECT * FROM Vehiculos WHERE PropietarioID = ?";

        String getAllServiciosQuery = "SELECT * FROM Servicios WHERE EstadoServicio = ?";
        String getServiciosByPlacaQuery = "SELECT * FROM Servicios WHERE VehiculoPlaca LIKE ? AND EstadoServicio = ?";
        String getServicioByIdQuery = "SELECT * FROM Servicios WHERE IdServicio = ?";
        String deleteServicioQuery = "DELETE FROM Servicios WHERE IdServicio = ?";
        String updateServicioQuery = "UPDATE Servicios SET PropietarioID = ?, VehiculoPlaca = ?, EstadoVehiculo = ?, MotivoIngreso = ? WHERE IdServicio = ?";
        String updateHorasServicioQuery = "UPDATE Servicios SET HorasTrabajo = ? WHERE IdServicio = ?;";
        String updateCostoManoObraServicioQuery = "UPDATE Servicios SET CostoManoObra = ? WHERE IdServicio = ?;";
        String updateRepuestosServicioQuery = "UPDATE Servicios SET CostoRepuestos = ? WHERE IdServicio = ?;";
        String setFinalQuery = "UPDATE Servicios SET FechaEntrega = ?, EstadoServicio = ? WHERE IdServicio = ?;";
        String insertServicioQuery = "INSERT INTO Servicios (CostoManoObra, CostoRepuestos, HorasTrabajo, PropietarioID, VehiculoPlaca, EstadoVehiculo, MotivoIngreso, EstadoServicio) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        
        // Crear el diccionario y almacenar las consultas
        Map<String, String> listQuery = new HashMap<>();
        
        /// Tablas
        listQuery.put("Propietarios", propietariosQuery);
        listQuery.put("Vehiculos", vehiculosQuery);
        listQuery.put("Usuarios", usuariosQuery);
        listQuery.put("Servicios", serviciosQuery);
        
        ///Users
        listQuery.put("AllUsers", allUsersQuery);
        listQuery.put("DeleteUser", deleteUserQuery);
        listQuery.put("InsertUser", insertUserQuery);
        listQuery.put("UpdateUser", updateUserQuery);
        listQuery.put("GetUserByPhone", getUserByPhoneQuery);
        listQuery.put("GetUsersByPhone", getUsersByPhoneQuery);
        
        /// Login 
        listQuery.put("IsLogin", isLogin);
        
        /// Owners
        listQuery.put("AllOwners", allOwnersQuery);
        listQuery.put("DeleteOwner", deleteOwnerQuery);
        listQuery.put("InsertOwner", insertOwnerQuery);
        listQuery.put("UpdateOwner", updateOwnerQuery);
        listQuery.put("GetOwnerByCedula", getOwnerByCedulaQuery); 
        listQuery.put("GetOwnersByCedula", getOwnersByCedulaQuery);
        
        //Automobiles
        listQuery.put("AllAutomobilesByOwnerID", allAutomobilesByOwnerIDQuery);
        listQuery.put("GetAutomobile", getAutomobileByPlacaQuery);
        listQuery.put("DeleteAutomobiles", deleteAutomobilesQuery);
        listQuery.put("DeleteAutomobile", deleteAutomobileQuery);
        listQuery.put("UpdateAutomobile", updateAutomobileQuery);
        listQuery.put("InsertAutomobile", insertAutomobileQuery);
        
        //Servicios
        listQuery.put("AllWorks", getAllServiciosQuery);
        listQuery.put("GetWorkById", getServicioByIdQuery);
        listQuery.put("GetWorksByPlaca", getServiciosByPlacaQuery);
        listQuery.put("DeleteWork", deleteServicioQuery);
        listQuery.put("UpdateWork", updateServicioQuery);
        listQuery.put("UpdateHoursWork", updateHorasServicioQuery);
        listQuery.put("UpdateCostoManoObraWork", updateCostoManoObraServicioQuery);
        listQuery.put("UpdateSparePartsWork", updateRepuestosServicioQuery);
        listQuery.put("setFinal", setFinalQuery);
        listQuery.put("InsertWork", insertServicioQuery);
        return listQuery;
    }
}
