package mitocode.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Los Genericos evitan evitar casteos, cuando se indica un tipo de dato en particular, se realiza un type safety
 * lo que proteje a que solo se acepte de un tipo de dato específico.
 */

public class App {
    public static void main(String[] args) {

        /*ClaseGeneric<String, Integer, Boolean, Double> generic = new ClaseGeneric("Angela", 20, true, 10.3);
        generic.showType();*/

        ClaseGeneric<String, Integer, Boolean, Double> generic1 = new ClaseGeneric<>("generic1", 11, false, 11.4);
        ClaseGeneric<String, Integer, Boolean, Double> generic2 = new ClaseGeneric<>("generic2", 12, true, 13.6);

        //Lista para llenar datos de tipo ClaseGeneric<String>
        List<ClaseGeneric<String, Integer, Boolean, Double>> genericList = new ArrayList<>();

        genericList.add(new ClaseGeneric<>("generic0", 13, false, 15.8));//Se crea una instancia de clase y se le pasa al constructor el nuevo dato a agregar en la lista.
        genericList.add(generic1);// otra manera de pasarle el dato para llenar la lista.
        genericList.add(generic2);

        //Recorrer la lista

        for (ClaseGeneric<String, Integer, Boolean, Double> clase : genericList) {
            clase.showType();
           /* System.out.println(((ClaseGeneric)clase).getObjectT());
            System.out.println(((ClaseGeneric)clase).getObjectK());
            System.out.println(((ClaseGeneric)clase).getObjectV());
            System.out.println(((ClaseGeneric)clase).getObjectE());*/
        }

    }
}
