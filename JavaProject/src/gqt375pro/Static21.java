package gqt375pro;
import java.util.Scanner;

class Static21 {
    static long recursiveFactorial(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * recursiveFactorial(number - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of arrangements: ");
        int number = sc.nextInt();

        System.out.println("Factorial = " +
                recursiveFactorial(number));
    }
}