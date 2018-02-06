package generics.introduction.mapExercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//HashMap: los elementos que se insertan no tienen un orden específico, no acepta claves duplicadas ni valores nulos.
public class hashMapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Casillas");
        map.put(3, "Pique");
        map.put(11, "Capdevila");
        map.put(16, "Busquets");
        map.put(18, "Pedrito");
        map.put(7, "Villa");
        map.put(15, "Ramos");
        map.put(5, "Puyol");
        map.put(14, "Xavi");
        map.put(8, "Xavi Alonzo");
        map.put(6, "Iniesta");

        Iterator<Integer> it = map.keySet().iterator(); //Se hace la búsqueda por la llave.
       // Iterator it = map.keySet().iterator(); //Se hace la búsqueda por la llave, es igual a la anterior búsqueda.

        while (it.hasNext()) {

            Integer key = (Integer) it.next();
            System.out.println("Key: " + key + "-> Valor: " + map.get(key));
        }
        //El resultado que tenemos es el siguiente, en el que vemos que nos da los objetos sin un "orden lógico"
    }
}
