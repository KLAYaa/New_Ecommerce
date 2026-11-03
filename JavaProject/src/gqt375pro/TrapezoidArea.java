package gqt375pro;
import java.util.Scanner;

class TrapezoidArea {

    double area(double a, double b, double height) {
        return 0.5 * (a + b) * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first parallel side: ");
        double a = sc.nextDouble();

        System.out.print("Enter second parallel side: ");
        double b = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        TrapezoidArea obj = new TrapezoidArea();

        System.out.println("Area = " + obj.area(a, b, h));
    }
}