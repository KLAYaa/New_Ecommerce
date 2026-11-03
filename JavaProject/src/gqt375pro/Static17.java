package gqt375pro;
import java.util.Scanner;

class Static17 {
    static double trapezoidArea(double side1, double side2, double height) {
        return ((side1 + side2) * height) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first parallel side: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter second parallel side: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.println("Trapezoid Area = " +
                trapezoidArea(side1, side2, height));
    }
}