package gqt375pro;
import java.util.Scanner;

class SumOverloading {

    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        SumOverloading obj = new SumOverloading();

        System.out.println("Sum = " + obj.sum(a, b));
    }
}