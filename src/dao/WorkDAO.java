package dao;

import database.ListQuery;

import java.sql.*;
import database.MyConnection;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import motortech.Work;

public class WorkDAO {

    private final static String DATABASE = "MotorTechDB";

    public List<Work> getAllWorks(String estado) {
        List<Work> works = new ArrayList<>();
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("AllWorks"))) {
            preparedStatement.setString(1, estado);

            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);

            List<Map<String, Object>> resultList = MyConnection.fetchData(DATABASE, query);
            if (resultList.isEmpty()) {
                System.err.println("No se tienen trabajos registrados");
                return works;
            }
            for (Map<String, Object> workResult : resultList) {
                Work work = new Work();
                work.setIdServicio((Integer) workResult.get("IdServicio"));
                work.setFechaIngreso((Timestamp) workResult.get("FechaIngreso"));
                
                LocalDateTime fechaEntrega = (LocalDateTime) workResult.get("FechaEntrega");
                if (fechaEntrega != null) {
                    work.setFechaEntrega(Timestamp.valueOf(fechaEntrega));
                }
                
                work.setCostoManoObra(((BigDecimal) workResult.get("CostoManoObra")).doubleValue());
                work.setCostoRepuestos(((BigDecimal) workResult.get("CostoRepuestos")).doubleValue());
                work.setHorasTrabajo((Integer) workResult.get("HorasTrabajo"));
                work.setPropietarioID((Integer) workResult.get("PropietarioID"));
                work.setVehiculoPlaca((String) workResult.get("VehiculoPlaca"));
                work.setEstadoVehiculo((String) workResult.get("EstadoVehiculo"));
                work.setMotivoIngreso((String) workResult.get("MotivoIngreso"));
                work.setEstadoServicio((String) workResult.get("EstadoServicio"));
                works.add(work);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al buscar trabajos con: " + estado + ": " + e.getMessage());
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

            LocalDateTime fechaEntrega = (LocalDateTime) workResult.get("FechaEntrega");
            if (fechaEntrega != null) {
                work.setFechaEntrega(Timestamp.valueOf(fechaEntrega));
            }

            work.setCostoManoObra(((BigDecimal) workResult.get("CostoManoObra")).doubleValue());
            work.setCostoRepuestos(((BigDecimal) workResult.get("CostoRepuestos")).doubleValue());
            work.setHorasTrabajo((Integer) workResult.get("HorasTrabajo"));
            work.setPropietarioID((Integer) workResult.get("PropietarioID"));
            work.setVehiculoPlaca((String) workResult.get("VehiculoPlaca"));
            work.setEstadoVehiculo((String) workResult.get("EstadoVehiculo"));
            work.setMotivoIngreso((String) workResult.get("MotivoIngreso"));
            work.setEstadoServicio((String) workResult.get("EstadoServicio"));
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al buscar el trabajo " + idServicio + ": " + e.getMessage());
        }
        return work;
    }

    public List<Work> getWorksByPlaca(String placa, String estado) {
        List<Work> works = new ArrayList<>();
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("GetWorksByPlaca"))) {

            preparedStatement.setString(1, placa + "%");
            preparedStatement.setString(2, estado);

            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);

            List<Map<String, Object>> resultList = MyConnection.fetchData(DATABASE, query);

            if (resultList.isEmpty()) {
                System.err.println("No se tienen trabajos con esa placa: " + placa);
                return works;
            }
            for (Map<String, Object> workResult : resultList) {
                Work work = new Work();
                work.setIdServicio((Integer) workResult.get("IdServicio"));
                work.setFechaIngreso((Timestamp) workResult.get("FechaIngreso"));

                LocalDateTime fechaEntrega = (LocalDateTime) workResult.get("FechaEntrega");
                if (fechaEntrega != null) {
                    work.setFechaEntrega(Timestamp.valueOf(fechaEntrega));
                }

                work.setCostoManoObra(((BigDecimal) workResult.get("CostoManoObra")).doubleValue());
                work.setCostoRepuestos(((BigDecimal) workResult.get("CostoRepuestos")).doubleValue());
                work.setHorasTrabajo((Integer) workResult.get("HorasTrabajo"));
                work.setPropietarioID((Integer) workResult.get("PropietarioID"));
                work.setVehiculoPlaca((String) workResult.get("VehiculoPlaca"));
                work.setEstadoVehiculo((String) workResult.get("EstadoVehiculo"));
                work.setMotivoIngreso((String) workResult.get("MotivoIngreso"));
                work.setEstadoServicio((String) workResult.get("EstadoServicio"));
                works.add(work);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al buscar sercios por placa " + placa + ": " + e.getMessage());
        }
        return works;
    }

    public boolean createWork(Work work) {
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("InsertWork"))) {
            preparedStatement.setBigDecimal(1, BigDecimal.valueOf(work.getCostoManoObra()));
            preparedStatement.setBigDecimal(2, BigDecimal.valueOf(work.getCostoRepuestos()));
            preparedStatement.setInt(3, work.getHorasTrabajo());
            preparedStatement.setInt(4, work.getPropietarioID());
            preparedStatement.setString(5, work.getVehiculoPlaca());
            preparedStatement.setString(6, work.getEstadoVehiculo());
            preparedStatement.setString(7, work.getMotivoIngreso());
            preparedStatement.setString(8, work.getEstadoServicio());

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
            preparedStatement.setInt(1, work.getPropietarioID());
            preparedStatement.setString(2, work.getVehiculoPlaca());
            preparedStatement.setString(3, work.getEstadoVehiculo());
            preparedStatement.setString(4, work.getMotivoIngreso());
            preparedStatement.setInt(5, work.getIdServicio());

            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar el trabajo: " + e.getMessage());
            return false;
        }
    }

    public boolean updateHoursWork(int hours, int idServicio) {
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("UpdateHoursWork"))) {
            preparedStatement.setInt(1, hours);
            preparedStatement.setInt(2, idServicio);

            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar las horas: " + e.getMessage());
            return false;
        }
    }

    public boolean updateHandCostWork(int cost, int idServicio) {
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("UpdateCostoManoObraWork"))) {
            preparedStatement.setInt(1, cost);
            preparedStatement.setInt(2, idServicio);

            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar costo de mano de obra: " + e.getMessage());
            return false;
        }
    }

    public boolean updateSparePartsWork(int cost, int idServicio) {
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("UpdateSparePartsWork"))) {
            preparedStatement.setInt(1, cost);
            preparedStatement.setInt(2, idServicio);

            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar costo de mano de obra: " + e.getMessage());
            return false;
        }
    }

    public boolean updateDateAndStateWork(LocalDateTime nowDate, String nowState, int idServicio) {
        Map<String, String> Querys = ListQuery.getListQuery();
        try (Connection connection = MyConnection.getConnection(DATABASE); PreparedStatement preparedStatement = connection.prepareStatement(Querys.get("setFinal"))) {
            preparedStatement.setTimestamp(1, Timestamp.valueOf(nowDate));
            preparedStatement.setString(2, nowState);
            preparedStatement.setInt(3, idServicio);

            String query = preparedStatement.toString();
            query = query.substring(query.indexOf(": ") + 2);
            return MyConnection.executeQuery(DATABASE, query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar la fecha final y el estado del servicio: " + e.getMessage());
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
