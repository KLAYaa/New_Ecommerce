package gqt375pro;
import java.util.Scanner;
public class arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i = 0;
        System.out.println("Enter the array elements:");
        while (i < n) {
            arr[i] = sc.nextInt();
            i++;
        }
        int sum = 0;
        i = 0;
        while (i < n) {
            sum = sum + arr[i];
            i++;
        }
        System.out.println("Sum of array elements = " + sum);
    }
}