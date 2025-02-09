package co.edu.uniquindio.poo.biblioteca1_0.model;

public class Usuario {

    private String nombre;
    private String id;
    private String email;

    public Usuario(String nombre, String id, String email){
        this.nombre = nombre;
        this.id = id;
        this.email = email;
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
}
