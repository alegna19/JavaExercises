package mitocode.java8.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {

    private Map<Integer, String> map;

    public void fillMap() {
        map = new HashMap<>();
        map.put(1, "Angie");
        map.put(2, "Maria");
        map.put(3, "Gomez");
        map.put(4, "");
    }

    /**
     * Para recorrer el contenido de un mapa, debemos apoyarnos en el método entrySet()
     * en entrySet es la lista de valores que tiene nuestro mapa.
     * En este caso se declara un for, dentro de el un tipo Entry y recorrer el entrySet()
     * y hacer un System.out de acuerdo al key y al value.
     */
    public void print_v7() {
        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());
        }
    }

    //Usando Java8
    public void print_v8() {
        //Usando una expresión Lambda.
        //map.forEach((k, v) -> System.out.println(" Key: " + k + "Value: " + v));

        //Usando el método entrySet(), stream() y el forEach() con referencias a métodos ::
        map.entrySet().stream().forEach(System.out::println);
    }

    /**
     * El método putIfAbsent() agrega un nuevo valor
     * al mapa si este no se encuentra, solo si esta ausente, no sobreescribe
     * el valor.
     */
    public void insertIfAbsent() {
        map.putIfAbsent(4, "New Value");
    }

    /**
     * El método computeIfPresent() opera si esta presente el elemento que le indique
     * dentro de la expresión Lambda.
     */
    public void ifPresent() {
        map.computeIfPresent(3, (k, v) -> k + v);
        System.out.println(map.get(3));
    }

    /**
     * El método getOrDefault() determina un valor por defecto en la posición o
     * key que se le indique en caso de que no exista, pero si existe ya ese key
     * va a mostrar el valor que contiene ese key.
     */
    public void getOrDefault() {
        String value = map.getOrDefault(5, "Default Value");
        System.out.println(value);
    }

    /**
     * Por ejemplo si tenemos un conjunto de elementos en un mapa y queremos filtrar esos
     * elementos bajo un criterio, si ese criterio obedece o se respeta extraemos
     * esos elementos a otra lista u otro mapa
     * En el ejemplo se evalua el mapa, aplicar una lógica de filtrado y extraer esos filtros a un mapa nuevo.
     */

    public void recolectar() {
        Map<Integer, String> mapaRecolectado = map.entrySet().stream()
                .filter(e -> e.getValue().contains("Ma"))
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));//Collect contiene Collectors y este un método toMap que convierte los elementos de un map a tipo Map.
        mapaRecolectado.forEach((k, v) -> System.out.println("Key: " + k + "Value: " + v));
    }


    public static void main(String[] args) {
        App app = new App();
        app.fillMap();
        //app.print_v7();
        //app.insertIfAbsent();
        //app.ifPresent();
        //app.getOrDefault();
        //app.print_v8();
        app.recolectar();
    }
}
