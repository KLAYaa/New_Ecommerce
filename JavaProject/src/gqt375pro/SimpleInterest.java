package gqt375pro;
import java.util.Scanner;

class SimpleInterest {

    double calculate(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter time: ");
        double t = sc.nextDouble();

        SimpleInterest obj = new SimpleInterest();

        System.out.println("Simple Interest = " +
                obj.calculate(p, r, t));
    }
}