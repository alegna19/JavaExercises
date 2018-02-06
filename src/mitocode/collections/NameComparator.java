package mitocode.collections;

import java.util.Comparator;

//Se implementa la interfaz Comparator, se debe sobreescribir el método compare.

public class NameComparator implements Comparator<Person> {

    /*
    Compara dos valores, si la comparación es:
    Positiva: Obj1 > Obj2
    0: Obj1 == Obj2
    Negativo: Obj1 < Obj2
     */

    @Override
    public int compare(Person per1, Person per2) {
        return per1.getName().compareTo(per2.getName());
    }


    //se sobreescribe el método compare, se hace un casteo sobre los objetos para que sean de tipo Persona
    // y luego se hace una comparación entre ambas cadenas de textos, y va a retornar un valor
    // + positivo, 0, u negativo -
   /* @Override
    public int compare(Object o1, Object o2) {
        Person per1 = (Person)o1;
        Person per2 = (Person)o2;
        return per1.getName().compareTo(per2.getName());
    }*/
}
