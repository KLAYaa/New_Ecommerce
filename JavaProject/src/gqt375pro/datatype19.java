//Write a program to find the factorial of a number using BigInteger class.
package gqt375pro;
import java.util.Scanner;
import java.math.BigInteger;
public class datatype19 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of " + n + " = " + factorial);
    }
}
