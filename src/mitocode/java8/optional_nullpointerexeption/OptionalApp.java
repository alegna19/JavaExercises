package mitocode.java8.optional_nullpointerexeption;

import mitocode.java8.interface_funtional.Operacion;

import java.util.Optional;

/**
 * esta clase optional permite gestionar de manera adecuada para
 * poder evitar los errores de tipo nullPointerExeption
 */
public class OptionalApp {

    public void test(String value) {
        //System.out.println(value.contains("Angie"));

        try {
            Optional op = Optional.empty();
            op.get();
        } catch (Exception e) {
            System.out.println("No hay elemento");
        }

    }


    public static void main(String[] args) {
        OptionalApp optionalApp = new OptionalApp();
        optionalApp.test("Angie");
    }
}
