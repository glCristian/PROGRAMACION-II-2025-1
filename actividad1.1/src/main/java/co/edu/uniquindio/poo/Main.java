package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        empresa empresa0 = new empresa("Movilidad SA");

        Propietario propietario0 = new Propietario("Juan", " 00", "none", "0", vehiculoPasajeros0) ;
        empresa0.añadirPropietario(propietario0);

        VehiculoPasajeros vehiculoPasajeros0 = new VehiculoPasajeros("ABC-123", "Corolla", "Toyota", "Blue", 4);
        empresa0.añadirVehiculo(vehiculoPasajeros0);
    }
}