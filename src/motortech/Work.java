package motortech;

public class Work {
    private int idServicio;
    private String fechaIngreso;
    private String fechaEntrega;
    private double costoManoObra;
    private double costoRepuestos;
    private int horasTrabajo;
    private int propietarioID;
    private String vehiculoPlaca;
    private String estadoVehiculo;
    private String motivoIngreso;
    private String estadoServicio;
    private String usuarioID;
    
    // Constructor
    public Work() {}

    public Work(int idServicio, String fechaIngreso, String fechaEntrega, double costoManoObra, double costoRepuestos, int horasTrabajo, int propietarioID, String vehiculoPlaca, String estadoVehiculo, String motivoIngreso, String estadoServicio, String usuarioID) {
        this.idServicio = idServicio;
        this.fechaIngreso = fechaIngreso;
        this.fechaEntrega = fechaEntrega;
        this.costoManoObra = costoManoObra;
        this.costoRepuestos = costoRepuestos;
        this.horasTrabajo = horasTrabajo;
        this.propietarioID = propietarioID;
        this.vehiculoPlaca = vehiculoPlaca;
        this.estadoVehiculo = estadoVehiculo;
        this.motivoIngreso = motivoIngreso;
        this.estadoServicio = estadoServicio;
        this.usuarioID = usuarioID;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getCostoManoObra() {
        return costoManoObra;
    }

    public void setCostoManoObra(double costoManoObra) {
        this.costoManoObra = costoManoObra;
    }

    public double getCostoRepuestos() {
        return costoRepuestos;
    }

    public void setCostoRepuestos(double costoRepuestos) {
        this.costoRepuestos = costoRepuestos;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public int getPropietarioID() {
        return propietarioID;
    }

    public void setPropietarioID(int propietarioID) {
        this.propietarioID = propietarioID;
    }

    public String getVehiculoPlaca() {
        return vehiculoPlaca;
    }

    public void setVehiculoPlaca(String vehiculoPlaca) {
        this.vehiculoPlaca = vehiculoPlaca;
    }

    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public String getMotivoIngreso() {
        return motivoIngreso;
    }

    public void setMotivoIngreso(String motivoIngreso) {
        this.motivoIngreso = motivoIngreso;
    }

    public String getEstadoServicio() {
        return estadoServicio;
    }

    public void setEstadoServicio(String estadoServicio) {
        this.estadoServicio = estadoServicio;
    }

    public String getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(String usuarioID) {
        this.usuarioID = usuarioID;
    }
}
