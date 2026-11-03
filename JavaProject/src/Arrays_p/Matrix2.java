package Arrays_p;

import java.util.Scanner;

public class Matrix2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size of the matrix: ");
		int a=sc.nextInt();
		System.out.println("Enter the coloum size of the matrix");
		int b = sc.nextInt();
		//creating the matrix
		int m1[][]=new int[a][b];
		int m2[][]=new int[a][b];
		int res[][]=new int[a][b];
		System.out.println("-----------");
		//adding values to the matrix
		System.out.println("Enter the Matrix M1: ");
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[i].length;j++) {
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("-----------");
		System.out.println("Enter the Matrix M2 :");
		for(int i=0;i<m2.length;i++) {
			for(int j=0;j<m2[i].length;j++) {
				m2[i][j]=sc.nextInt();
			}
		}
	//Performing the Multiplication of 2 matrix
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				for(int k=0;k<res[i].length;k++) {
					res[i][j]=res[i][j]+(m1[i][k]*m2[k][j]);
				}
			}
		}
		System.out.println("----------");
		//dispaying the addition matrix result
		System.out.println("Resultant matrix:");
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.print(res[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
