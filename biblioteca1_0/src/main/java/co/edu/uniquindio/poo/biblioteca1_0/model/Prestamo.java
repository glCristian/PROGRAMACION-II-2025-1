package co.edu.uniquindio.poo.biblioteca1_0.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prestamo {

    private MaterialBibliografico material;
    private Usuario admin;
    private Usuario cliente;
    private LocalDate fechaPrestamo;

    public Prestamo(MaterialBibliografico material, Usuario admin, Usuario cliente, LocalDate fechaPrestamo) {
        this.material = material;
        this.admin = admin;
        this.cliente = cliente;
        this.fechaPrestamo = LocalDate.now();
    }




}
