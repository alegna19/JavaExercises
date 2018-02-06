package generics.introduction.mapExercises;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

//TreeMap: El mapa lo ordena de forma natural, ej: si son valores enteros los ordena de menor a mayor.
public class treeMapExample {

    public static void main(String[] args) {

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Casillas");
        treeMap.put(3, "Pique");
        treeMap.put(11, "Capdevila");
        treeMap.put(16, "Busquest");
        treeMap.put(18, "Pedrito");
        treeMap.put(7, "Villa");
        treeMap.put(15, "Ramos");
        treeMap.put(5, "Puyol");
        treeMap.put(14, "Xavi");
        treeMap.put(8, "Hernandez");
        treeMap.put(6, "Iniesta");

        Iterator<Integer> iterator = treeMap.keySet().iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("Key: " + key + " -> Value: " + treeMap.get(key));
            //System.out.println("Size of TreeMap: " + treeMap.size());
            //System.out.println("TreeMap is Empty: " + treeMap.isEmpty());
            //System.out.println("One element of TreeMap: " + treeMap.get(18));
            //System.out.println("Delete element of TreeMap: " + treeMap.remove(18));
            //System.out.println("There are an element with the key in the TreeMap: " + treeMap.containsKey(14));
            //System.out.println("Contains Value: " + treeMap.containsValue("Angie"));
            //System.out.println("Borramos todos los elementos del Map: treeMap.clear()");treeMap.clear();
            //System.out.println("Comprobamos si lo hemos eliminado viendo su tamaño: treeMap.size() = "+treeMap.size());
        }

        //El resultado que tenemos es el siguiente en el que vemos que nos ordena los objetos por clave en "orden natural"

    }
}
