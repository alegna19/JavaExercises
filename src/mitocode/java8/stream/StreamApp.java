package mitocode.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {

    private List<String> list;
    private List<String> numbers;

    public StreamApp() {
        list = new ArrayList<>();
        list.add("Maria");
        list.add("Zapata");
        list.add("Angie");
        list.add("Gomez");

        numbers = new ArrayList<>();
        numbers.add("2");
        numbers.add("3");
    }

    /**
     * Filtramos todos los elementos que empiecen con la letra M
     * implementamos el método stream el cual tenemos acceso al método filter()
     * y dentro de el agregamos una expresión Lambda y para imprimirlo uso el forEach()
     * dentro utilizo el método de referencia System usando el simbolo ::
     */
    public void filter() {
        //Usando una expresión Lambda en el forEach.
        //list.stream().filter(x -> x.startsWith("M")).forEach(x -> System.out.println(x));

        //Usando la referencia a métodos para imprimir.
        list.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
    }

    /**
     * Usando el método stream podemos utilizar el método sorted() donde usamos una expresion
     * Lamda y usar el compareToIgnoreCase o podemos solo invocar el método sorted() y no pasarle nada
     * igual lo ordena.
     */
    public void sort() {
        //Usando esta comparacion con la expresión Lambda, los datos salen de forma desentente.
        //list.stream().sorted((x,y) -> y.compareToIgnoreCase(x)).forEach(System.out :: println);
        list.stream().sorted().forEach(System.out::println);
    }

    /**
     * La función map es para transformar los elementos de la lista, a través de los
     * elementos que estemos indicando.
     */
    public void transform() {
        //Me convierte todos los elementos de la lista en Mayuscula
        //list.stream().map(String::toUpperCase).forEach(System.out::println);


        //Forma tradicional para convertir a Integer los elementos de una lista.
        /*for (String x : numbers) {
            int num = Integer.parseInt(x) + 1;
            System.out.println(num);
        }*/

        //Para este caso convertimos los elementos de la lista numbers en Integer
        //usando una expresión Lambda.
        numbers.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
    }


    /**
     * El método limit, muestra el número de elementos que le indiquemos
     * al pasarle en el método limit()
     */
    public void limit() {
        list.stream().limit(2).forEach(System.out::println);
    }

    /**
     * El Método count() me cuenta el número de elementos
     * que contiene la lista.
     */
    public void count() {
        long numberCount = list.stream().count();
        System.out.println(numberCount);
    }


    public static void main(String[] args) {
        StreamApp streamApp = new StreamApp();
        //streamApp.filter();
        //streamApp.sort();
        //streamApp.transform();
        //streamApp.limit();
        streamApp.count();

    }
}
