package co.edu.uniquindio.poo;

public class Propietario {

    private String nombre;
    private String id;
    private String email;
    private String telefono;
    private Vehiculo vehiculo;

    public Propietario(String nombre, String id, String email, String telefono, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.id = id;
        this.email = email;
        this.telefono = telefono;
        this.vehiculo = vehiculo;

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
