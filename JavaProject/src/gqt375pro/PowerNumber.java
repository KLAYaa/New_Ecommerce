package gqt375pro;
import java.util.Scanner;

class PowerNumber {

    double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();

        PowerNumber obj = new PowerNumber();

        System.out.println("Result = " + obj.power(base, exponent));
    }
}