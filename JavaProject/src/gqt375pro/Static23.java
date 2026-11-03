package gqt375pro;
import java.util.Scanner;

class Static23 {
    static double recursivePower(double base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base * recursivePower(base, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        System.out.println("Result = " +
                recursivePower(base, exponent));
    }
}