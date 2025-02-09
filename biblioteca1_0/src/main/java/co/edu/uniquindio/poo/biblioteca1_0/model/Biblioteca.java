package co.edu.uniquindio.poo.biblioteca1_0.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<MaterialBibliografico> materiales;

    public Biblioteca(String nombre, List<MaterialBibliografico> materiales) {
        this.nombre = nombre;
        this.materiales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<MaterialBibliografico> getMateriales() {
        return materiales;
    }
    public void setMateriales(List<MaterialBibliografico> materiales) {
        this.materiales = materiales;
    }


    //.........................








}
