package gqt375pro;
import java.util.Scanner;

class Static3 {
    static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter wheel radius: ");
        double radius = sc.nextDouble();

        System.out.println("Circle Area = " + calculateCircleArea(radius));
    }
}