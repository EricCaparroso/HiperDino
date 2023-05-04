package net.salesianos.supermercado;

import net.salesianos.supermercado.cajero.Cajero;
import net.salesianos.supermercado.cliente.Cliente;
import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cajero cajero = new Cajero("Juan");

        boolean salir = false;
        while (!salir) {
            System.out.println("\n-- Supermercado --");
            System.out.println("1. Abrir caja");
            System.out.println("2. Añadir un nuevo cliente a la cola");
            System.out.println("3. Atender un cliente");
            System.out.println("4. Ver clientes pendientes");
            System.out.println("5. Cerrar caja");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cajero.abrirCaja();
                    break;
                case 2:
                    Cliente cliente = new Cliente();
                    cajero.añadirCliente(cliente);
                    break;
                case 3:
                    cajero.atenderCliente();
                    break;
                case 4:
                    cajero.verClientesPendientes();
                    break;
                case 5:
                    cajero.cerrarCaja();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }
}
