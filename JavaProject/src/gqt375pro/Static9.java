package gqt375pro;
import java.util.Scanner;

class Static9 {
    static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter field base: ");
        double base = sc.nextDouble();

        System.out.print("Enter field height: ");
        double height = sc.nextDouble();

        System.out.println("Triangle Area = " + calculateTriangleArea(base, height));
    }
}