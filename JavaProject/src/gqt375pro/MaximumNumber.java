package gqt375pro;
import java.util.Scanner;

class MaximumNumber {

    int maximum(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        MaximumNumber obj = new MaximumNumber();

        System.out.println("Maximum = " + obj.maximum(a, b));
    }
}