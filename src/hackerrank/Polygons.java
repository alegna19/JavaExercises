package hackerrank;

import java.util.Scanner;

public class Polygons {

   /** You must determinate if a given right quadrilateral (a four-sided polygon with only right angles) is a squares, a rectangle, or neither.
    * 2. if the polygon is a square.
    * 1. if the polygon is a rectangle.
    * 0. if it is neither or if is not a polygon(without area)
    */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Add side A for the polygon: ");
        int sideA = sc.nextInt();
        System.out.println("Add side B for the polygon: ");
        int sideB = sc.nextInt();
        System.out.println("Add side C for the polygon: ");
        int sideC = sc.nextInt();
        System.out.println("Add side D for the polygon: ");
        int sideD = sc.nextInt();

        System.out.println("Value is: "+ Polygons.polygon(sideA, sideB, sideC, sideD));

        }

    static int polygon(int a,  int b, int c, int d){
        return (a == b && c == d && b == c) ? 2 : (a == c && b == d) ? 1: 0;
    }
}
