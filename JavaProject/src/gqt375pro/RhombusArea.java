package gqt375pro;
import java.util.Scanner;

class RhombusArea {

    double area(double diagonal1, double diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first diagonal: ");
        double d1 = sc.nextDouble();

        System.out.print("Enter second diagonal: ");
        double d2 = sc.nextDouble();

        RhombusArea obj = new RhombusArea();

        System.out.println("Area = " + obj.area(d1, d2));
    }
}