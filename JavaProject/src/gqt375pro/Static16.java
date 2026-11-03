package gqt375pro;
import java.util.Scanner;

class Static16 {
    static double parallelogramArea(double base, double height) {
        return base * height;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter garden base: ");
        double base = sc.nextDouble();

        System.out.print("Enter garden height: ");
        double height = sc.nextDouble();

        System.out.println("Parallelogram Area = " +
                parallelogramArea(base, height));
    }
}