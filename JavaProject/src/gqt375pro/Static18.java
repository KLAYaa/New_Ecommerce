package gqt375pro;
import java.util.Scanner;

class Static18 {
    static double polygonArea(int sides, double sideLength) {
        return (sides * sideLength * sideLength) /
               (4 * Math.tan(Math.PI / sides));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sides: ");
        int sides = sc.nextInt();

        System.out.print("Enter side length: ");
        double sideLength = sc.nextDouble();

        System.out.println("Regular Polygon Area = " +
                polygonArea(sides, sideLength));
    }
}