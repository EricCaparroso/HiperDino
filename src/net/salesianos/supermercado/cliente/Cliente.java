package net.salesianos.supermercado.cliente;

import net.salesianos.supermercado.utils.GeneradorProductos;
import net.salesianos.supermercado.utils.GeneradorNombres;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cliente {
    private String nombre;
    private List<String> listaDeArticulos;

    public Cliente() {
        this.nombre = GeneradorNombres.getRandomNombre();
        this.listaDeArticulos = generarArticulosAleatorios();
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getListaDeArticulos() {
        return listaDeArticulos;
    }

    private List<String> generarArticulosAleatorios() {
        List<String> articulos = new ArrayList<>();
        GeneradorProductos generadorProductos = new GeneradorProductos();
        Random random = new Random();
        int numProductos = random.nextInt(10) + 1; // Generamos entre 1 y 10 productos aleatorios
        for (int i = 0; i < numProductos; i++) {
            articulos.add(generadorProductos.randomProduct());
        }
        return articulos;
    }
}
