package gqt375pro;
import java.util.Scanner;

class CircleArea {

    double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        CircleArea obj = new CircleArea();

        System.out.println("Area = " + obj.area(radius));
    }
}