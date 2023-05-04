package net.salesianos.supermercado.utils;

import java.util.Random;

public class GeneradorProductos {

    private static final String[] listaProductos = {
            "DinoQueso Gourmet", "DinoAceitunas Premium", "DinoDonuts Extreme edition", "DinoPapas Deluxe",
            "DinoMargarina sofisticada", "Dinoagua First-clas", "Dinopan Exclusive", "DinoElegant Aguacates",
            "DinoFrijoles First-clas", "DinoCarne de res Superior", "DinoPlátanos Elite", "DinoManzanas Refined"
    };

    public static String randomProduct() {
        Random random = new Random();
        int index = random.nextInt(listaProductos.length);
        return listaProductos[index];
    }

}

