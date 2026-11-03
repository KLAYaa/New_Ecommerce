package gqt375pro;
import java.util.Scanner;

class Static13 {
    static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter table length: ");
        double length = sc.nextDouble();

        System.out.print("Enter table width: ");
        double width = sc.nextDouble();

        System.out.println("Rectangle Area = " +
                rectangleArea(length, width));
    }
}