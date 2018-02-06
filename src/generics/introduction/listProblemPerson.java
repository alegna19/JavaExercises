package generics.introduction;




import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listProblemPerson {
    public static void main(String[] args) {

        Person donPrayer = new Person(" Don Prayer ", 89);
        Person peggyOlson = new Person(" Peggy Olson ", 40);

        List<Person> personList = new ArrayList<>();
        personList.add(donPrayer);
        personList.add(peggyOlson);
        personList.add(new Person(" Angela Gomez ", 33));


        //System.out.println(personList.get(0));
        //System.out.println(personList.size());

       /* for(int i=0; i < personList.size(); i++){
            Person listNames = personList.get(i);
            System.out.println(listNames);
        }*/

        Iterator<Person> iterator = personList.iterator();
        //personIterator.hasNext();// Método que devuelve true si existe un siguiente elemento a la hora de iterar sobre una colección.
        //personIterator.next();// Devuelve el siguiente elemento en una iteracción.

        while (iterator.hasNext()) {
            Person listNames = iterator.next();
            System.out.println(listNames);
        }

       /* for(Person printPerson : personList){
            System.out.println(printPerson);
        }*/

    }
}
