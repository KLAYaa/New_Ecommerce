package gqt375pro;

import java.util.Scanner;

public class sample {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size: ");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++) {
		if(i%2==0) {
			System.out.println(" "+ i);
		}
	}
}
}
