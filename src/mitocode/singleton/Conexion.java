package mitocode.singleton;

//Patrón Singleton es poseer una única instancia de una clase en particular, en este caso es la clase Conexión.
public class Conexion {

    private static Conexion instance = null;

    public static Conexion getInstance() {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    private Conexion(){
    }
}
