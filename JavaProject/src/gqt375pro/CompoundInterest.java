package gqt375pro;
import java.util.Scanner;

class CompoundInterest {

    double calculate(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter time: ");
        double t = sc.nextDouble();

        CompoundInterest obj = new CompoundInterest();

        System.out.println("Compound Interest = " +
                obj.calculate(p, r, t));
    }
}