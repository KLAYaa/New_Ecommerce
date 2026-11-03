package gqt375pro;
import java.util.Scanner;

class Static24 {
    static int fibonacciNumber(int position) {

        if (position == 0) {
            return 0;
        }

        if (position == 1) {
            return 1;
        }

        return fibonacciNumber(position - 1)
                + fibonacciNumber(position - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacciNumber(i) + " ");
        }
    }
}