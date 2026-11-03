package gqt375pro;
import java.util.Scanner;

class Static8 {
    static double findRoot(double number) {
        return Math.sqrt(number);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance value: ");
        double number = sc.nextDouble();

        System.out.println("Square Root = " + findRoot(number));
    }
}