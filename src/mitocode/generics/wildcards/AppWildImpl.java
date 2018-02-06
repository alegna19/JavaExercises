package mitocode.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

/*
* WildCard es el signo ? que significa que es un tipo de dato desconocido como un comodin, puede ser cualquier tipo de dato.
*
* */


public class AppWildImpl {

    /**
     * Se le conoce como wildCard UnBounded cuando se le indica ? sin importar de donde va extender
     * es decir que colocar getList(List<?> alumnoList) es lo mismo que decir getList(List<? extend Object> alumnoList)
     * este operador ? va a recibir cualquier Objeto.
     *
     * @param alumnoList
     */

    public void getListUnBounded(List<?> alumnoList) {
        for (Object alumno : alumnoList) { // El tipo de dato seria Ocject por que no se sabe que tipo de dato es la lista y se realiza un casteo
            if (alumno instanceof Alumno) { // Se valida si el objeto es del tipo de la clase Alumno para evitar un classCastException
                System.out.println(((Alumno) alumno).getName());
            }

        }

    }

    /**
     * Se le conoce como UpperBounded cuando Cualquier subClase que sea de la clase que se indica luego del signo ?
     * es decir getListUpperBounded(List<? extends Persona> personList)
     * le estoy indicando que cualquier subClase de Persona va a reconocer el tipo que le pase(Alumno u Profesor)
     *
     * @param personList
     */

    public void getListUpperBounded(List<? extends Persona> personList) {
        for (Persona persona : personList) {
            if (persona instanceof Persona) {
                System.out.println(persona.getName());
            }
        }
    }

    /**
     * Se le conoce como LowerBounded a las clases que son mayores a la clase que le indiquemos es decir
     * en lugar de usar extends usamos super getListLowerBounded(List<? super Alumno> debe ser una clase superior a Alumno
     *
     * @param personList
     */

    public void getListLowerBounded(List<? super Alumno> personList) {
        for (Object al : personList) {
            //if (al instanceof Alumno) {
                System.out.println(((Persona) al).getName());
            //}
        }
    }


    public static void main(String[] args) {
        AppWildImpl appWildImp = new AppWildImpl();

        Persona alumno1 = new Persona("Angela");
        Alumno alumno2 = new Alumno("Maria");
        Alumno alumno3 = new Alumno("Gomez");
        Profesor alumno4 = new Profesor("Marin");


        List<Persona> list = new ArrayList<>();
        list.add(alumno1);
        list.add(alumno2);
        list.add(alumno3);
        list.add(alumno4);


        //appWildImp.getListUnBounded(list);
        //appWildImp.getListUpperBounded(list);
        appWildImp.getListLowerBounded(list);
    }
}
