package mitocode.java8.default_methods;

public interface PersonA {

     void walk();

     //Al ser un método por defecto se necesita implementarlo.
     public default void speak(){
         System.out.println("Hi Couders - PersonA");
     }
}
