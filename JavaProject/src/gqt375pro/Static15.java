package gqt375pro;
import java.util.Scanner;

class Static15 {
    static double rhombusArea(double diagonal1, double diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first diagonal: ");
        double diagonal1 = sc.nextDouble();

        System.out.print("Enter second diagonal: ");
        double diagonal2 = sc.nextDouble();

        System.out.println("Rhombus Area = " +
                rhombusArea(diagonal1, diagonal2));
    }
}