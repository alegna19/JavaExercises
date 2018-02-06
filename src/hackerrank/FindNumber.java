package hackerrank;

import java.io.IOException;
import java.util.Scanner;

//The function must return a string “YES” or “NO” denoting if the element is present in the array or not.

public class FindNumber {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[3];


        for (int i = 0; i < array.length; i++) {
            System.out.println("Insert a value for the position " + (i + 1) + ": ");
            array[i] = sc.nextInt();

        }
      /* Print the elements of array.
       for(int j = 0; j < array.length; j++){
            System.out.println("values of array: " + array[j]);
        }*/

        System.out.println(FindNumber.findNumber(array, 3));

    }

    static String findNumber(int[] arr, int k) {

        String valueEnd = "NO";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                valueEnd = "YES";
            }
        }
        return valueEnd;
    }
}
