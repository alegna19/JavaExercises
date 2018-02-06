package mitocode.java8.method_reference;

import java.util.Arrays;


/**
 * En java 8 se agrego una funcionalidad conocida como métodos a referencia con el simbolo ::
 * con el cual permite un código más legible y corto. Los métodos referenciados NO pueden
 * enviarsen parámetros por que Java no implementa un tema conocido como Curriificación.
 * <p>
 * Currificación: currificar es transformar funciones en funciones mas simples y mas reutilizables
 *
 * +++++Las referencias a métodos siempre se apoyan en interfaces funcionales.+++++
 */
public class MethodRef {

    public static void referenciaMetodoStatico() {
        System.out.println("Método referido static");
    }

    /**
     * Método de instancia donde se tiene un arreglo con 3 elementos, se ordena y se imprime
     * se encuentran 3 tipos de ejemplos, el tradicional implementando una clase anónima
     * usando una expresión Lambda y usando una referencia con el simbolo ::
     * <p>
     * por que de instancia, por que al recorrerse el arreglo internamente es una instancia de cada elemento String.
     */
    public void referenciarMetodoInstanciaObjetoArbitrario() {
        String[] names = {"Angie", "Gómez", "Marín"};

        /**
         * Ejemplo usando una clase anónima, Java7, manera tradicional.
         */
        //
        /*Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        for(String arr : names){
            System.out.println(arr);
        }*/

        /**
         * Ejemplo usando una expresión Lambda Java8.
         */
        /*Arrays.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(Arrays.toString(names));*/

        /**
         * Ejemplo usando la referencia a un método ::
         * String por que es la clase que se va a comparar y se invoca el método compareToIgnoreCase
         * internamente el método compareToIgnoreCase ya sabe que debe comparar dos valores.
         */

        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }

    /**
     * Los métodos a referencia se apoyan mucho en las interfaces funcionales
     * la interfaz funcional tiene un único método saludar()
     * y se implementa con la expreasión
     * Operacion op = app :: referenciaMetodoInstanciaObjetoParticular; que esta a la derecha
     * Java utiliza los metodos como si fueran parametros para poder implementar otros métodos.
     */
    public void referenciaMetodoInstanciaObjetoParticular() {
        System.out.println("Metodo Referido Instancia de un Objeto en Particular");
    }

    public void referenciarConstructor() {
        /**
         * Ejemplo usando implementación clásica, con una clase Anónima Java7.
         */
       /* IPersona iper = new IPersona() {
            @Override
            public Persona crear(int id, String name) {
                return new Persona(id, name);
            }
        };
        iper.crear(1, "angie");*/

        /**
         * Ejemplo usando implementación Lambda.
         */
       /* IPersona iper2 = (x, y) -> (new Persona(x, y));
        Persona per = iper2.crear(1, "angie");
        System.out.println(per.getId() + " - " + per.getName()); */

        /**
         * Usando la referencia a métodos, que quiero?
         * devolver una nueva instancia, de quien? de Persona.
         */
        IPersona iper3 = Persona :: new;
        Persona per = iper3.crear(1, "angie");
        System.out.println(per.getId() + " - " + per.getName());
    }


    /**
     * Método operar que ejecuta un llamado al método referenciaMetodoStatico().
     */
    public void operar() {
        //Operacion op = () -> MethodRef.referenciaMetodoStatico();  //Usando una expresión Lambda
        //op.saludar();

        //Usando la referencia al método con :: los 4 puntos.
        Operacion op = MethodRef::referenciaMetodoStatico;
        op.saludar();
    }


    public static void main(String[] args) {
        MethodRef app = new MethodRef();
        //app.operar();
        //app.referenciarMetodoInstanciaObjetoArbitrario();
        //Operacion op = app::referenciaMetodoInstanciaObjetoParticular;//Es una funcion que se la estoy mandando como implemementacion a mi metodo saludar.
        //op.saludar();
        app.referenciarConstructor();
    }
}
