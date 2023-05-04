package net.salesianos.supermercado.cajero;

import net.salesianos.supermercado.cliente.Cliente;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
    private String nombre;
    private Queue<Cliente> colaClientes;
    private boolean cajaAbierta;

    public Cajero(String nombre) {
        this.nombre = nombre;
        this.colaClientes = new LinkedList<>();
        this.cajaAbierta = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isCajaAbierta() {
        return cajaAbierta;
    }

    public void abrirCaja() {
        if (cajaAbierta) {
            System.out.println("La caja ya estaba abierta.");
        } else {
            cajaAbierta = true;
            System.out.println("La caja ha sido abierta.");
        }
    }

    public void cerrarCaja() {
        cajaAbierta = false;
        System.out.println("La caja ha sido cerrada.");
    }

    public void añadirCliente(Cliente cliente) {
        if (!cajaAbierta) {
            System.out.println("La caja está cerrada, no se puede añadir un nuevo cliente.");
        } else {
            colaClientes.add(cliente);
            System.out.println("Se ha añadido un nuevo cliente a la cola:\n" + cliente.getNombre() + " - " + cliente.getListaDeArticulos().toString());
        }
    }

    public void atenderCliente() {
        if (colaClientes.isEmpty()) {
            System.out.println("No hay clientes a los que atender en la cola.");
        } else {
            Cliente cliente = colaClientes.poll();
            System.out.println("El cliente " + cliente.getNombre() + " ha sido atendido.");
        }
    }

    public void verClientesPendientes() {
        System.out.println("Clientes en cola para " + nombre + ":");
        for (Cliente cliente : colaClientes) {
            System.out.println(cliente.getNombre() + " - " + cliente.getListaDeArticulos().toString());
        }
    }
}

