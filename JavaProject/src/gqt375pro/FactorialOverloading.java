package gqt375pro;
import java.util.Scanner;
public class FactorialOverloading {
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        FactorialOverloading obj = new FactorialOverloading();
        System.out.println("Factorial = " + obj.factorial(n));
    }
}