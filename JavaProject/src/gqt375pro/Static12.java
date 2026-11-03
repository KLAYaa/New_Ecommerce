package gqt375pro;
import java.util.Scanner;

class Static12 {
    static double calculateCompoundInterest(double principal,
                                            double rate,
                                            double time) {
        double amount = principal * Math.pow(1 + rate / 100, time);
        return amount - principal;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter duration: ");
        double time = sc.nextDouble();

        System.out.println("Compound Interest = " +
                calculateCompoundInterest(principal, rate, time));
    }
}