package mitocode.instancia_static;

public class Alumno extends Persona {

    //Un mé†odo de instancia no puede ser sobreescrito por un método estático

    public static int sumar(int number){
        return number + 2;
    }
}
