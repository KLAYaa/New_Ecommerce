//Write a program to multiply two matrices
package gqt375pro;
import java.util.Scanner;
public class datatype25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // First matrix
        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter first matrix elements:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        // Second matrix
        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter second matrix elements:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        // Check multiplication condition
        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }
        // Result matrix
        int[][] result = new int[r1][c2];
        // Matrix multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] = result[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        // Display result
        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}