package co.edu.uniquindio.poo;

public class VehiculoPasajeros extends Vehiculo {
    private int numeroPasajeros;

    public VehiculoPasajeros(String placa, String modelo, String marca, String color, int numeroPasajeros) {
        super(placa, modelo, marca, color);
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public String toString() {
        return "VehiculoPasajeros{" +
                "numeroPasajeros=" + numeroPasajeros +
                '}';
    }
}
