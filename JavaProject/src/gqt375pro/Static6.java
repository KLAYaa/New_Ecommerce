package gqt375pro;
import java.util.Scanner;

class Static6 {
    static int findMinimum(int first, int second) {
        if (first < second)
            return first;
        else
            return second;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first temperature: ");
        int first = sc.nextInt();

        System.out.print("Enter second temperature: ");
        int second = sc.nextInt();

        System.out.println("Minimum = " + findMinimum(first, second));
    }
}