package mitocode.instanceof_exam;

import java.util.ArrayList;
import java.util.List;

//instanceOf valida Si el valor es una instancia de lo que esta en la mano derecha es decir el tipo de Objeto.
public class App {

    private List bucket = new ArrayList();

    public static void main(String[] args) {

       /* String texto = new String("Angela");
        if(texto instanceof String){
            System.out.println("Es un String ");
        }*/

        Apple apple = new Apple("RED");
        Apple apple2 = new Apple("GREEN");
        Orange orange = new Orange("POMELO");
        Biscuit biscuit = new Biscuit("CHOCOLAT");

        App app = new App();
        app.verifyBucket(apple);
        app.verifyBucket(apple2);
        app.verifyBucket(orange);
        app.verifyBucket(biscuit);

    }

    public void verifyBucket(Object obj) {
        if (obj instanceof Fruits) {
            bucket.add(obj);
            System.out.println("Added fruit: " + ((Fruits) obj).getName());
        } else {
            System.out.println("This element not allowed, Only fruits please");
        }

    }
}
