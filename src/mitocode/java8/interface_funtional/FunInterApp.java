package mitocode.java8.interface_funtional;

/**
 * Java 8 usa Interfaz Funcional, que significa que la interfaz solo puede tener un método
 * cuando se usan expresiones Lambdas, para identificarlas se coloca la anotacion
 *
 * @FunctionalInterface en la interfaz
 * si tengo una interfaz con mas de un método NO puedo usar expresiones lambdas.
 * La  clase que usa las operaciones de la interfaz NO implementa la interfaz.
 */

public class FunInterApp {

   /* @Override
    public double calcular(double x, double y) {
        //double average = (x + y) / 2;
        //return average;
        Operacion op = (n1, n2) -> (n1 + n2) / 2;//Invoco la interfaz y le pasamos una expresión Lambda.
        return op.calcular(x, y);
    }*/

    public double operar(double x, double y) {
        Operacion op = ((n1, n2) -> (n1 + n2) / 2);
        return op.calcular(x, y);
    }


    public static void main(String[] args) {
        FunInterApp app = new FunInterApp();
        double resp = app.operar(2, 3);
        System.out.println(resp);
    }

}
