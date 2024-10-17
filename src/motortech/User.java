package motortech;

public class User {
    private String telefono;
    private String nombresApellidos;
    private String correoElectronico;
    private String contrasena;
    private String usuario;


    // Constructor
    public User() {}

    public User(String telefono, String nombresApellidos, String correoElectronico, String contrasena, String usuario) {
        this.telefono = telefono;
        this.nombresApellidos = nombresApellidos;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    // Getters y Setters
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

