package dao;

import database.ListQuery;

import java.sql.*;
import database.MyConnection;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import motortech.Work;

public class WorkDAO {

    private final static String DATABASE = "MotorTechDB";

    public List<Work> getAllWorks() {
        List<Work> works = new ArrayList<>();
        Map<String, String> Querys = ListQuery.getListQuery();
        List<Map<String, Object>> resultList = MyConnection.fetchData(DATABASE, Querys.get("AllWorks"));
        if (resultList.isEmpty()) {
            System.err.println("No se tienen trabajos registrados");
            return works;
        }
        for (Map<String, Object> workResult : resultList) {
            Work work = new Work();
            work.setIdServicio((Integer) workResult.get("IdServicio"));
            work.setFechaIngreso((Timestamp) workResult.get("FechaIngreso"));
            work.setFechaEntrega((Date) workResult.get("FechaEntrega"));
            work.setCostoManoObra(((BigDecimal) workResult.get("CostoManoObra")).doubleValue());
            work.setCostoRepuestos(((BigDecimal) workResult.get("CostoRepuestos")).doubleValue());
            work.setHorasTrabajo((Integer) workResult.get("HorasTrabajo"));
            work.setPropietarioID((Integer) workResult.get("PropietarioID"));
            work.setVehiculoPlaca((String) workResult.get("VehiculoPlaca"));
            work.setEstadoVehiculo((String) workResult.get("EstadoVehiculo"));
            work.setMotivoIngreso((String) workResult.get("MotivoIngreso"));
            work.setEstadoServicio((String) workResult.get("EstadoServicio"));
            work.setUsuarioID((String) workResult.get("UsuarioID"));
            works.add(work);
        }
        return works;
    }

    public Work getWork(int idServicio) {
        Work work = new Work();
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("GetWorkById"))) {
            preparedStatement.setInt(1, idServicio);
            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            List<Map<String, Object>> resultList = MyConnection.fetchData(DATABASE, query);
            if (resultList.isEmpty()) {
                System.out.println("No se encontró el trabajo con ID: " + idServicio);
                return work;
            }
            Map<String, Object> workResult = resultList.get(0);
            work.setIdServicio((Integer) workResult.get("IdServicio"));
            work.setFechaIngreso((Timestamp) workResult.get("FechaIngreso"));
            work.setFechaEntrega((Date) workResult.get("FechaEntrega"));
            work.setCostoManoObra(((BigDecimal) workResult.get("CostoManoObra")).doubleValue());
            work.setCostoRepuestos(((BigDecimal) workResult.get("CostoRepuestos")).doubleValue());
            work.setHorasTrabajo((Integer) workResult.get("HorasTrabajo"));
            work.setPropietarioID((Integer) workResult.get("PropietarioID"));
            work.setVehiculoPlaca((String) workResult.get("VehiculoPlaca"));
            work.setEstadoVehiculo((String) workResult.get("EstadoVehiculo"));
            work.setMotivoIngreso((String) workResult.get("MotivoIngreso"));
            work.setEstadoServicio((String) workResult.get("EstadoServicio"));
            work.setUsuarioID((String) workResult.get("UsuarioID"));
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al buscar el trabajo " + idServicio + ": " + e.getMessage());
        }
        return work;
    }

    public boolean createWork(Work work) {
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("InsertWork"))) {

            preparedStatement.setDate(1, work.getFechaEntrega());
            preparedStatement.setBigDecimal(2, BigDecimal.valueOf(work.getCostoManoObra()));
            preparedStatement.setBigDecimal(3, BigDecimal.valueOf(work.getCostoRepuestos()));
            preparedStatement.setInt(4, work.getHorasTrabajo());
            preparedStatement.setInt(5, work.getPropietarioID());
            preparedStatement.setString(6, work.getVehiculoPlaca());
            preparedStatement.setString(7, work.getEstadoVehiculo());
            preparedStatement.setString(8, work.getMotivoIngreso());
            preparedStatement.setString(9, work.getEstadoServicio());
            preparedStatement.setString(10, work.getUsuarioID());

            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar el trabajo: " + e.getMessage());
            return false;
        }
    }

    public boolean updateWork(Work work) {
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("UpdateWork"))) {
            preparedStatement.setDate(1, work.getFechaEntrega());
            preparedStatement.setBigDecimal(2, BigDecimal.valueOf(work.getCostoManoObra()));
            preparedStatement.setBigDecimal(3, BigDecimal.valueOf(work.getCostoRepuestos()));
            preparedStatement.setInt(4, work.getHorasTrabajo());
            preparedStatement.setInt(5, work.getPropietarioID());
            preparedStatement.setString(6, work.getVehiculoPlaca());
            preparedStatement.setString(7, work.getEstadoVehiculo());
            preparedStatement.setString(8, work.getMotivoIngreso());
            preparedStatement.setString(9, work.getEstadoServicio());
            preparedStatement.setString(10, work.getUsuarioID());
            preparedStatement.setInt(11, work.getIdServicio());
            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar el trabajo: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteWork(int idServicio) {
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("DeleteWork"))) {
            preparedStatement.setInt(1, idServicio);
            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al eliminar el trabajo con id: " + idServicio);
            return false;
        }
    }

}
