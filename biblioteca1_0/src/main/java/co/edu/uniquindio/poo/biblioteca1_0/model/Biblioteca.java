package co.edu.uniquindio.poo.biblioteca1_0.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.LinkedList;


public class Biblioteca {
    private String nombre;
    private Collection<MaterialBibliografico> materiales;
    private Collection<Cliente> clientes;



    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.materiales = new LinkedList<>();
        this.clientes = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<MaterialBibliografico> getMateriales() {
        return materiales;
    }
    public void setMateriales(List<MaterialBibliografico> materiales) {
        this.materiales = materiales;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    //.........................



    public boolean verificarCliente(String id) {
        boolean existeCliente = false;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                existeCliente = true;
            }
        }
        return existeCliente;
    }


    public boolean agregarCliente(Cliente cliente) {
        boolean centinela = false;
        if (!verificarCliente(cliente.getId())) {
            clientes.add(cliente);
            centinela = true;
        }
        return centinela;
    }


    public boolean actualizarCliente(String id, Cliente actualizado) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                cliente.setNombre(actualizado.getNombre());
                cliente.setId(actualizado.getId());
                cliente.setEmail( actualizado.getEmail());
                centinela = true;
                break;
            }
        }
        return centinela;
    }


    public boolean eliminarCliente(String id) {
        boolean centinela = false;
        for (Cliente cliente : clientes){
            if(cliente.getId().equals(id)){
                clientes.remove(cliente);
                centinela = true;
                break;
            }
        }
        return centinela;
    }










}
