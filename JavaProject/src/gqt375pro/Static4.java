package gqt375pro;
import java.util.Scanner;

class Static4 {
    static int calculateTotal(int[] numbers) {
        int total = 0;

        for (int value : numbers) {
            total = total + value;
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of daily expenses: ");
        int size = sc.nextInt();

        int[] expenses = new int[size];

        System.out.println("Enter expenses:");

        for (int i = 0; i < size; i++) {
            expenses[i] = sc.nextInt();
        }

        System.out.println("Total = " + calculateTotal(expenses));
    }
}