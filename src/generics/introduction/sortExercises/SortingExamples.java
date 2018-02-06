package generics.introduction.sortExercises;

import generics.introduction.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExamples {

    public static void main(String[] args) {

        Person donPrayer = new Person(" Don Prayer ", 89);
        Person peggyOlson = new Person(" Peggy Olson ", 65);
        Person bertCooper = new Person(" Bert Cooper ", 100);

        List<Person> personList = new ArrayList<>();
        personList.add(donPrayer);
        personList.add(peggyOlson);
        personList.add(bertCooper);

        System.out.println(personList);

        //Recibe dos parámetros, el primero es la lista y el segundo es comparator, define el orden en que se ordena, por edad,nombre etc..
        Collections.sort(personList, new AgeComparator());

        System.out.println(personList);

        //Manejando Generics
        // Se instancia un nuevo objeto ReverseCompator que recibe un comparator e implementa comparable
        Collections.sort(personList, new ReverseComparator<>( new AgeComparator()));

        System.out.println(personList);

    }
}
