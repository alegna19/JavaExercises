package mitocode.java8.default_methods;

/**
 * Un método default es: un método que esta implementado en una interfaz, para que cualquier clase
 * que implemente esta interfaz ya tenga acceso al método definido, por defecto.
 *
 */

public class DefaultMethod implements PersonA, PersonB {

    @Override
    public void walk() {
        System.out.println("Hi Couders");
    }

    /* Si tuviera dos interfaces con el mismo nombre de método por defecto, la clase principal lo sobreescribe
    * pero llama al super para acceder al método.
    @Override
    public void speak() {
        PersonB.super.speak();
    }*/


    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.speak(); //Me trae el método por defecto.
    }
}
