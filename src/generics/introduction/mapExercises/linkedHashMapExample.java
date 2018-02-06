package generics.introduction.mapExercises;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

//LinkedHashMap: Inserta en el mapa los elementos en el orden en como se van insertando, por lo que las búsquedas son más lentas.
public class linkedHashMapExample {
    public static void main(String[] args) {

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Casillas");
        linkedHashMap.put(3, "Pique");
        linkedHashMap.put(11, "Capdevila");
        linkedHashMap.put(16, "Busques");
        linkedHashMap.put(18, "Pedrito");
        linkedHashMap.put(7, "Villa");
        linkedHashMap.put(15, "Ramos");
        linkedHashMap.put(5, "Puyol");
        linkedHashMap.put(14, "Xavi Alonzo");
        linkedHashMap.put(8, "Hernandez");
        linkedHashMap.put(6, "Iniesta");

        Iterator<Integer> iterator = linkedHashMap.keySet().iterator();

        while(iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println("Key: " + key + " -> Value: "  + linkedHashMap.get(key));
        }
        //El resultado que tenemos es el siguiente en el que vemos que nos ordena los objetos tal y como los hemos ido introduciendo

        System.out.println("ForEach: Alternative way to bucle of Map: ");

        for(Map.Entry<Integer, String> player : linkedHashMap.entrySet()){
            Integer key = player.getKey();
            String value = player.getValue();
            System.out.println(key + " -> " + value);

        }
    }
}
