package gqt375pro;
import java.util.Scanner;

class ParallelogramArea {

    double area(double base, double height) {
        return base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        ParallelogramArea obj = new ParallelogramArea();

        System.out.println("Area = " + obj.area(base, height));
    }
}