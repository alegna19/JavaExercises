package array.printNumber;

import java.util.Scanner;

public class ArrayInsertUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the size of Array ");
        int size = Integer.parseInt(sc.next());//lee el tamaño del arreglo.
        int[] numbers = new int[size];
        Scanner sc1 = new Scanner(System.in);

        try {
            if (numbers.length > 0 && numbers.length < 10) {
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println("Insert a value for the position " + (i + 1) + ":");
                    numbers[i] = sc1.nextInt(); //sc1.nextInt() es el valor que se ingresa por pantalla, queda guardado en la posición del arreglo.
                }
                for (int j = 0; j < numbers.length; j++) {
                    System.out.print("[" + numbers[j] + "]"); // imprime el contenido del arreglo.
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
