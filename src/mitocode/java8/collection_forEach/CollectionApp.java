package mitocode.java8.collection_forEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionApp {

    private List<String> list;

    //List<String> l = new ArrayList<>();

    public void fillList() {
        list = new ArrayList<>();

        list.add("Gomez");
        list.add("Angela");
        list.add("Maria");
    }

    /**
     * Recorrer los elementos de una lista.
     */
    public void usedForEach() {
        /**
         * Manera tradicional de recorrer una lista e
         * imprimir los elementos de la lista, usando for Each.
         */
        /*for (String element : list) {
            System.out.println(element);
        }*/

        /**
         * Usando el método forEach que recibe consumer, el consumer es una interfaz funcional
         * que tiene un único método llamado accept.
         * Para este caso, le pasamos una variable x que es la que va a recorrer la lista
         * e imprimimos esa variable, es decir cada elemento de la lista. A través de una expresión Lambda.
         */
        //list.forEach(x -> System.out.println(x));

        /**
         * Usando las referencias a métodos con el simbolo ::
         */
        list.forEach(System.out::println);
    }

    /**
     * Remover un elemento de una lista.
     */
    public void usedRemoveIf() {
        /**
         * Manera tradicional de remover un elemento, usando Iterator.
         */
       /* Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equalsIgnoreCase("Maria")){
                iterator.remove();
            }
        }*/

        /**
         * Usando Lambdas, aplicando el metodo removeIF que usa Predicate
         * sirve para agregar, eliminar.. etc, la pasamos una variable que va a
         * comparar si es igual al valor "Angela" el cual va a hacer eliminado.
         */
        list.removeIf(x -> x.equalsIgnoreCase("Angela"));
    }

    /**
     * Ordenar la lista usando la expresión Lambda
     * a través del método sort, le pasamos dos parámetros hacemos el uso del
     * método compareToIgnoreCase y ordenamos.
     */
    public void sortList() {
        list.sort((x, y) -> x.compareToIgnoreCase(y));
    }

    public static void main(String[] args) {
        CollectionApp collectionApp = new CollectionApp();
        collectionApp.fillList();
        //collectionApp.usedRemoveIf();
        collectionApp.sortList();
        collectionApp.usedForEach();


    }
}
