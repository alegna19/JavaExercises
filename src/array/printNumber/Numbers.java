package array.printNumber;


//Create an array that show number since 1  to 100.
public class Numbers {

    public static void main(String[] args) {
       int[] numbers = new int[100];

       for(int i=0; i < numbers.length; i++){
           numbers[i] = i + 1;
           int value =  numbers[i];
           System.out.println(value);
       }
    }

}
