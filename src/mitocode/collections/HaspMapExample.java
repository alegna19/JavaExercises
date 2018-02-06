package mitocode.collections;

import java.util.HashMap;

public class HaspMapExample {

    public static void main(String[] args) {
        HashMap diccionario = new HashMap();
        diccionario.put("user", "MitoCode");
        diccionario.put("canal", "Youtube");
        diccionario.put("publicidad", "Facebook");

        String contenido = diccionario.get("canal").toString();
        boolean respuesta = diccionario.containsKey("user");

        System.out.println(contenido);
        System.out.println(respuesta);
    }
}
