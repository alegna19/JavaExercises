package generics.introduction;

import java.util.HashSet;
import java.util.Set;

public class setProblemPerson {

    public static void main(String[] args) {

        Person donPrayer = new Person(" Don Prayer ", 89);
        Person peggyOlson = new Person(" Peggy Olson ", 40);
        Person angie = new Person(" Angie ", 40);

        Set<Person> personList = new HashSet<>(); //Set permite solo un único elemento de la lista, no repite os valores.
        personList.add(donPrayer);
        personList.add(peggyOlson);
        personList.add(donPrayer);

        System.out.println(personList.contains(donPrayer));
        System.out.println(personList.contains(angie));


        for (Person person : personList){
            System.out.println(person);
        }


    }

}
