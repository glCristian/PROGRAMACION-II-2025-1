package co.edu.uniquindio.poo;

public class VehiculoCarga extends Vehiculo {

    private int capacidadCarga;
    private int numeroEjes;

    public VehiculoCarga(String placa, String modelo, String marca, String color, int capacidadCarga, int numeroEjes) {
        super(placa, modelo, marca, color);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        return "VehiculoCarga{" +
                "capacidadCarga=" + capacidadCarga +
                ", numeroEjes=" + numeroEjes +
                '}';
    }
}

