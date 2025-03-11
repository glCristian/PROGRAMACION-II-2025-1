package co.edu.uniquindio.poo.gestionhospital.model;

public class Paciente extends Persona implements Cloneable{

    private Historial historial;

    public Paciente(String nombre, String id, int edad) {
        super(nombre, id, edad);
        this.historial = new Historial();

    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    @Override
    public Paciente clone() {
        try {
            Paciente pacienteClon = new Paciente(super.getNombre(), super.getId(), super.getEdad());
            pacienteClon.historial = this.historial.clonarHistorial();
            return pacienteClon;
        } catch (Exception e) {
            throw new RuntimeException("Error al clonar el paciente", e);
        }
    }




    @Override
    public String toString() {
        return  "Paciente: " + getNombre() + " (ID: " + getId() + ", Edad: " + getEdad() + ")\n" + historial;
    }
}
