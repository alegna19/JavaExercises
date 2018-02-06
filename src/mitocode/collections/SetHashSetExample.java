package mitocode.collections;

import java.util.HashSet;
import java.util.Set;

/*el Set permite agregar elementos a una lista y el resultado es un orden arbitrário,
sin embargo no permite valores repetidos en la lista, funciona como un distinc en sql
 */
public class SetHashSetExample {
    public static void main(String[] args) {

        Set<String> lista = new HashSet<>();
        lista.add("a");
        lista.add("a");
        lista.add("c");

        for (String dato : lista) {
            System.out.println(dato);
        }
    }
}
