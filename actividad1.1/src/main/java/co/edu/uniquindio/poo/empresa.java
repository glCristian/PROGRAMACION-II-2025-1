package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class empresa {

    private String nombre;
    private LinkedList<Propietario> propietarios;
    private LinkedList<Vehiculo> vehiculos;

    public empresa(String nombre){
        this.nombre = nombre;
        this.propietarios = new LinkedList<>();
        this.vehiculos = new LinkedList<>();
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LinkedList<Propietario> getPropietarios() {
        return propietarios;
    }
    public void setPropietarios(LinkedList<Propietario> propietarios) {
        this.propietarios = propietarios;
    }
    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void añadirPropietario(Propietario propietario) {
        propietarios.add(propietario);
    }

    public void añadirVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    @Override
    public String toString() {
        return "empresa{" +
                "nombre='" + nombre + '\'' +
                ", propietarios=" + propietarios +
                ", vehiculos=" + vehiculos +
                '}';
    }
}
