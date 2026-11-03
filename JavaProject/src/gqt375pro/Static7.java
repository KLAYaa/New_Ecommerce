package gqt375pro;
import java.util.Scanner;

class Static7 {
    static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base value: ");
        double base = sc.nextDouble();

        System.out.print("Enter exponent value: ");
        double exponent = sc.nextDouble();

        System.out.println("Power = " + calculatePower(base, exponent));
    }
}