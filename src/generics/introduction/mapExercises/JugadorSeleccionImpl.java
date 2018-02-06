package generics.introduction.mapExercises;

import java.util.Map;
import java.util.TreeMap;

public class JugadorSeleccionImpl {
    public static void main(String[] args) {

        System.out.println("TreeMap with Object and Key is a String:    ");
        Map<String, JugadorSeleccion> jugadores = new TreeMap<>();
        jugadores.put("Casillas", new JugadorSeleccion(1, "Casillas", "Portero"));
        jugadores.put("Ramos", new JugadorSeleccion(15, "Ramos", "Lateral"));
        jugadores.put("Pique", new JugadorSeleccion(13, "Pique", "Central"));
        jugadores.put("Buyol", new JugadorSeleccion(5, "Buyol", "Central"));
        jugadores.put("Xabi", new JugadorSeleccion(14, "Xabi", "Izquierdo"));

        for (Map.Entry<String, JugadorSeleccion> jugador : jugadores.entrySet()) {
            String key = jugador.getKey();
            JugadorSeleccion value = jugador.getValue();
            System.out.println(key + " -> " + value);
        }
    }
}
