package Arrays_p;

import java.util.Scanner;

public class array2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the total number of classes: ");
	int cls=sc.nextInt();
	System.out.println("Enter the total number of students in each class: ");
	int stu=sc.nextInt();
	String arr[][]=new String[cls][stu];
	for(int i=0;i<arr.length;i++) {
		System.out.println("Inside classroom no: "+ (i + 1));
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Enter the name of student: "+(j+1));
			arr[i][j]=sc.next();
			System.out.println("--------");
		}
	}
	System.out.println("==========");
	for(int i=0;i<arr.length;i++) {
		System.out.println("Inside classroom no: "+ (i + 1));
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Enter the name of student: "+(j+1) +" is" +  arr[i][j]);
//			arr[i][j]=sc.next();
			System.out.println("--------");
		}
	}
}
}


















