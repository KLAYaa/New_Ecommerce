package gqt375pro;

import java.util.Scanner;

public class gdc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		System.out.println("Enter another value: ");
		int b=sc.nextInt();
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		System.out.println(a);
	}
}
