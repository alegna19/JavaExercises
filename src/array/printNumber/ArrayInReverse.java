package array.printNumber;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayInReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the size of array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Insert the number in the position " + (i + 1) + " :");
            numbers[i] = sc.nextInt();
        }
        for (int j = numbers.length - 1; j > 0; j--) {
            System.out.println("Reverses' Values: " + numbers[j]);
        }
    }
}

/* Con valores quemados.
class TestClass {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {5,4,12,7,15,9};

        for(int j=numbers.length -1; j>0; j--){
            System.out.println(numbers[j]);
        }
    }
}
*
* */
