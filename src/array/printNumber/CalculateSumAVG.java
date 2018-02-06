package array.printNumber;

public class CalculateSumAVG {

    public static void main(String[] args) {

        int[] numbers = new int[100];
        int sum = 0;
        double average = 0;

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
            sum += numbers[i];//suma lo que está en la posición del arreglo.
            average = sum/numbers.length;// en una variable average coge lo que esta en sum y lo / por el tamañó del arreglo.
        }
        System.out.println("Total Sum: " + sum);
        System.out.println("Total Average: " + average);
    }
}
