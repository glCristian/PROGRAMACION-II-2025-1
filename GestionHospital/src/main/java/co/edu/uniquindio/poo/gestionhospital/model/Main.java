package co.edu.uniquindio.poo.gestionhospital.model;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Paciente paciente0 = new Paciente("Carlos", "0", 35);

        Doctor doctor0 = new Doctor("Raul", "doc", 55,"Medicina generla");

        Consulta consulta0 = new Consulta(LocalDate.of(2015, 03, 11), paciente0, doctor0);
        consulta0.getEnfermedades().add("Gripa");
        consulta0.getMedicamentos().add("Acetaminofen");


        paciente0.getHistorial().agregarConsulta(consulta0);


        System.out.println(paciente0.toString());

    }

}
