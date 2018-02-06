package mitocode.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*

Otra manera para ordenar colecciones en Java es mediante el uso de la interfaz Comparator
Se usa comparator cuando en la lista tiene mas de un parámetro por lo tanto el método
sort no va a saber por que parámetro ordenar, en este caso por edad, o nombre o id se puede comparar, por eso
se debe crear una nueva clase e implementar la interfaz Comparator y sobreescribir el método.
*/

public class ApiCollectionComparatorExa {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Angie", 25));
        list.add(new Person(1, "Maria", 15));
        list.add(new Person(1, "Baracaldo", 29));

        //Collections.sort(list, new NameComparator());

        /*
        Ordena por edad, pero se debe implementar de nuevo la
        interfaz Comparator y sobreescribir el método.
        El método compare verifica si el primer objeto es menor que el segundo
        devuelve un valor negativo -1
        Devuelve un cero 0 si los dos argumentos son iguales.
        Devuelve un número positivo si el primer elemento es mayor que el segundo.
         */
        //

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person per1, Person per2) {
                int resp = 0;
                if(per1.getAge() > per2.getAge()){
                    return resp = 1;
                }else if(per1.getAge() < per2.getAge()){
                    return resp = -1;
                }

                return resp;
            }
        });

        for(Person p : list){
            System.out.println(p.getAge()+ " " +  p.getName());
        }
    }

}
