package mitocode.instancia_static;

public class App {
    public static void main(String[] args) {
        //No se puede tener un método de instancia y otro static en herencia.
        //La subclase sobreescribe a la clase Padre por eso el resultado es 3.

        //Cuando son métodos estáticos no se necesitan instancias. además el método de la clase Padre queda Oculto, no sobreescribe lo oculta.
        int value = Alumno.sumar(1);
        System.out.println("Valor cuando el método es estatico: " + value);

        //Alumno alumno = new Alumno();
        //System.out.println(alumno.sumar(1));
    }
}
