package gqt375pro;
import java.util.Scanner;

class MinimumNumber {

    int minimum(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        MinimumNumber obj = new MinimumNumber();

        System.out.println("Minimum = " + obj.minimum(a, b));
    }
}