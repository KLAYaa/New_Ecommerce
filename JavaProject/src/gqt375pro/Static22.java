package gqt375pro;
import java.util.Scanner;

class Static22 {
    static int digitSum(int number) {

        if (number == 0) {
            return 0;
        }

        return (number % 10) + digitSum(number / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a code number: ");
        int number = sc.nextInt();

        System.out.println("Sum of digits = " +
                digitSum(number));
    }
}