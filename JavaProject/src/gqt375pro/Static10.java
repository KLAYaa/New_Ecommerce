package gqt375pro;
import java.util.Scanner;

class Static10 {
    static double calculateInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter interest rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();

        System.out.println("Simple Interest = " +
                calculateInterest(principal, rate, time));
    }
}