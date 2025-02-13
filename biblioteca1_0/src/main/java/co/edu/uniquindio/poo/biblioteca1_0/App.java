package co.edu.uniquindio.poo.biblioteca1_0;

import co.edu.uniquindio.poo.biblioteca1_0.model.*;

import java.time.LocalDate;
import java.util.Date;
import javafx.application.Application;

public class App  {

    public static void main(String[] args) {
        Biblioteca biblioteca0 = new Biblioteca("UQ");

        Admin admin0 = new Admin("Liz", "0", "123");


        Cliente client0 = new Cliente("Juan", "0", "123");
        biblioteca0.agregarCliente(client0);

        MaterialBibliografico libro0 = new MaterialBibliografico("x", "x", "20000", "0000", TipoMaterial.LIBRO, true);

        Prestamo prestamo0 = new Prestamo(libro0, client0, admin0, LocalDate.now());
    }

}
