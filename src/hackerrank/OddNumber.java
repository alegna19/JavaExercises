package hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[3];

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Insert a value for the position " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println(OddNumber.oddNumbers(2, 5));


    }

    static int[] oddNumbers(int l, int r) {
        int[] values = {};
        return values;
    }
}





