package mitocode.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
    Se implementa la interfaz Comparable en la clase Person y se sobreescribe
    el método compareTo donde es mas simple de usar que el comparator, este retorna un valor int
    se puede ordenar por string e int.

    El método compareTo verifica si el primer objeto es menor que el segundo
        devuelve un valor negativo -1
        Devuelve un cero 0 si los dos argumentos son iguales.
        Devuelve un número positivo si el primer elemento es mayor que el segundo.
 */
public class ApiCollectionComparableExa {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Angie", 25));
        list.add(new Person(1, "Maria", 15));
        list.add(new Person(1, "Baracaldo", 29));

        Collections.sort(list);

        for(Person p : list){
            System.out.println(p.getAge() + "-" + p.getName());
        }

    }
}
