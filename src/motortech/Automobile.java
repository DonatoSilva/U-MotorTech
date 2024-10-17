package motortech;

public class Automobile {
    private String placa;
    private String tarjetaPropiedad;
    private String tipoVehiculo;
    private int propietarioID;

    // Constructor
    public Automobile() {}

    public Automobile(String placa, String tarjetaPropiedad, String tipoVehiculo, int propietarioID) {
        this.placa = placa;
        this.tarjetaPropiedad = tarjetaPropiedad;
        this.tipoVehiculo = tipoVehiculo;
        this.propietarioID = propietarioID;
    }

    // Getters y Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTarjetaPropiedad() {
        return tarjetaPropiedad;
    }

    public void setTarjetaPropiedad(String tarjetaPropiedad) {
        this.tarjetaPropiedad = tarjetaPropiedad;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getPropietarioID() {
        return propietarioID;
    }

    public void setPropietarioID(int propietarioID) {
        this.propietarioID = propietarioID;
    }
}

