package mitocode.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApiCollectionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Gomez");
        list.add("Angela");
        list.add("Maria");

        Collections.sort(list); //Ordena la lista alfabéticamente, también ordena Integers.

        System.out.println(list);

    }
}
