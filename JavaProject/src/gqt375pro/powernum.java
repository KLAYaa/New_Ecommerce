package gqt375pro;
import java.util.Scanner;
public class powernum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Enter the power:");
        int p = sc.nextInt();
        int result = 1;
        int i = 1;
        while (i <= p) {
            result = result * n;
            i++;
        }
        System.out.println("The Power of number is: " + result);
    }
}