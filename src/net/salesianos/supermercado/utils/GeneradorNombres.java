package net.salesianos.supermercado.utils;
import java.util.Random;

public class GeneradorNombres{

    private static final String[] nombres = new String[] {
            "El Vaquilla", "señor Pollo", "Mr Cerdo", "El Adrian ;)", "Perroflauta", "Amanda","Carlota","Pablo","Don Omar","Lalo","El Torete","El Jaro","El Pera","Edd","Eddy","Sonic","Ronaldo","21 Savage","Lil Wayne","Jhon Cena"
    };


    public static String getRandomNombre() {

        Random random = new Random();
        int randomIndex = random.nextInt(GeneradorNombres.nombres.length);
        System.out.println(GeneradorNombres.nombres[randomIndex]);
        return GeneradorNombres.nombres[randomIndex];

    }


}
