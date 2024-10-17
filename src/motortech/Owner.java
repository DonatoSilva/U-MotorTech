/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motortech;

/**
 *
 * @author figue
 */
public class Owner {
    private int cedula;
    private String nombresApellidos;
    private String numeroTarjetaPropiedad;
    private String direccion;
    private String telefono;
    private String correoElectronico;

    // Constructor
    public Owner() {}

    public Owner(int cedula, String nombresApellidos, String numeroTarjetaPropiedad, String direccion, String telefono, String correoElectronico) {
        this.cedula = cedula;
        this.nombresApellidos = nombresApellidos;
        this.numeroTarjetaPropiedad = numeroTarjetaPropiedad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    // Getters y Setters
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public String getNumeroTarjetaPropiedad() {
        return numeroTarjetaPropiedad;
    }

    public void setNumeroTarjetaPropiedad(String numeroTarjetaPropiedad) {
        this.numeroTarjetaPropiedad = numeroTarjetaPropiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}

