package generics.introduction;

import java.util.Arrays;

public class ArrayProblemPerson {

    public static void main(String[] args) {
        Person person1 = new Person("Angela", 27);
        Person person2 = new Person("Maria", 30);

        Person[] arrayPerson = {person1, person2};

        System.out.println(Arrays.toString(arrayPerson));

        Person person3 = new Person("Gomez", 31);

        arrayPerson = addNewPerson(person3, arrayPerson);

        System.out.println(Arrays.toString(arrayPerson));
    }

    private static Person[] addNewPerson(Person person3, Person[] arrayPerson) {
        int length = arrayPerson.length;
        arrayPerson = Arrays.copyOf(arrayPerson, length + 1);
        arrayPerson[length] = person3;
        return arrayPerson;
    }
}
