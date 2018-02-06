package mitocode.java8;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Al trabajar con Lambdas es pensar: Que es lo que necesito, mas no el como lo necesito.
 */

public class LamdaApp {

    public void ordenar() {
        List<String> list = new ArrayList<>();
        list.add("MitoCode");
        list.add("Code");
        list.add("Mito");

        //Así se usa en java7
        /*Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                  return o1.compareTo(o2);
            }
        });*/


        /**
         * Usando java8
         * Que necesito? dos parámetros que van a hacer comparados después de la expresión lamdba.
         */
        Collections.sort(list, (String p1, String p2) -> p1.compareTo(p2));

        for (String element : list) {
            System.out.println(element);
        }

    }

    /**
     * dentro del método average se instancia un objeto de tipo Operation, este es una interfaz
     * pero como las interfaces no se pueden instanciar al colocar los corchetes {} se crea una clase anónima
     * dentro de la clase Operation que es anónima se crea el método calculateAverage.
     */
    public void average() {
        /*Operation operation = new Operation() {
            @Override
            public double calculateAverage(double n1, double n2) {
                return (n1 + n2) / 2;
            }
        };
        System.out.println(operation.calculateAverage(2, 3));*/

        //Es lo mismo que esta arriba pero usando Lambda, Que es lo que necesito?
        //Un objeto de tipo interfaz, donde quiero dos variables expresión lambda y opere el promedio.
        //Operation operation = (double n1, double n2) -> (n1 + n2)/2; Se puede y no dejar el tipo de dato double,
                                                                        // ya que se sabe que la interfaz tiene una declaración de método donde recibe
                                                                        // dos parámetros de tipo double
        Operation operation = ( n1,  n2) -> (n1 + n2)/2;
        Operation operation1 = (x, y) -> (x + y);
        System.out.println(operation1.calculateAverage(3,2));

        System.out.println(operation.calculateAverage(2, 3));

    }

    public static void main(String[] args) {
        LamdaApp app = new LamdaApp();
        app.ordenar();
        app.average();
    }
}
