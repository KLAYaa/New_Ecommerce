package gqt375pro;

import java.util.Scanner;

class Static5 {
    static int findMaximum(int first, int second) {
        if (first > second)
            return first;
        else
            return second;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first score: ");
        int first = sc.nextInt();

        System.out.print("Enter second score: ");
        int second = sc.nextInt();

        System.out.println("Maximum = " + findMaximum(first, second));
    }
}