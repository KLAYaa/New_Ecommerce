package gqt375pro;
import java.util.Scanner;

class SquareRoot {

    double root(double n) {
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();

        SquareRoot obj = new SquareRoot();

        System.out.println("Square Root = " + obj.root(n));
    }
}