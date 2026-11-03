package gqt375pro;
import java.util.Scanner;

class Static2 {
    static long findFactorial(int number) {
        long result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books in a row: ");
        int number = sc.nextInt();

        System.out.println("Factorial = " + findFactorial(number));
    }
}