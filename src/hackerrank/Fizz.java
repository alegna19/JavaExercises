package hackerrank;


public class Fizz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) System.out.print("Fizz");
            if (i % 5 == 0) System.out.print("Buzz");
            else if (i % 3 != 0) System.out.print(i);
            System.out.println();

            /*for(int j=1; j<=100; j++){
                if(j % 3 ==0 )
                    System.out.println("Fizz");
                if(j % 5 == 0)
                    System.out.println("Buzz");
                else if(j % 3 !=0 ){
                    System.out.println(j);
                    //System.out.println();
                }*/
        }
    }
}


