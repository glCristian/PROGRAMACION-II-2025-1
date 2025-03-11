package co.edu.uniquindio.poo.gestionhospital.model;

import java.util.Collection;
import java.util.LinkedList;

public class Hospital {

    private String nombre;
    private Collection<Paciente> pacientes;
    private Collection<Doctor> doctores;
    private Collection<Cita> citas;
    protected GestorConfig gestorConfig;



    public Hospital(String nombre) {
        this.nombre = nombre;
        this.pacientes = new LinkedList<>();
        this.doctores = new LinkedList<>();
        this.citas = new LinkedList<>();
        this.gestorConfig = gestorConfig.getInstance();
    }


}
