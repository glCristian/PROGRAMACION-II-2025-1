package co.edu.uniquindio.poo.gestionhospital.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Historial {

    private Collection<Consulta> consultas;

    public Historial() {
        this.consultas = new LinkedList<>();
    }

    public void agregarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public Collection<Consulta> getConsultas() {
        return consultas;
    }

    public Historial clonarHistorial() {
        Historial historialClon = new Historial();
        for (Consulta consulta : this.consultas) {
            historialClon.agregarConsulta(consulta.clonarConsulta());
        }
        return historialClon;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("📜 Historial Médico:\n");

        if (consultas.isEmpty()) {
            sb.append("   - No hay consultas registradas.\n");
        } else {
            for (Consulta consulta : consultas) {
                sb.append("   ➤ ").append(consulta).append("\n");
            }
        }

        return sb.toString();
    }



}
