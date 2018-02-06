package generics.introduction;

import java.util.HashMap;
import java.util.Map;

public class mapProblemPerson {

    public static void main(String[] args) {
        Person donPrayer = new Person(" Don Prayer ", 89);
        Person peggyOlson = new Person(" Peggy Olson ", 40);
        Person angie = new Person(" Angie ", 30);

        Map<String, Person> personMap = new HashMap<>();//Key = String, Value= person
        personMap.put(donPrayer.getName(), donPrayer);
        personMap.put(peggyOlson.getName(), peggyOlson);
        personMap.put(angie.getName(), angie);

        for(Map.Entry<String, Person> entry : personMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }





    }
}
