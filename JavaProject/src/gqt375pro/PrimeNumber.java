package gqt375pro;

import java.util.Scanner;

class PrimeNumber {

    boolean checkPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        PrimeNumber obj = new PrimeNumber();

        if (obj.checkPrime(n))
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}