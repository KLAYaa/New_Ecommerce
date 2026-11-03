package gqt375pro;
import java.util.Scanner;

class Static11 {
    static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter tank radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter tank height: ");
        double height = sc.nextDouble();

        System.out.println("Cylinder Volume = " +
                cylinderVolume(radius, height));
    }
}