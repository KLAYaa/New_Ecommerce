package Arrays_p;

import java.util.Scanner;

public class array1 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the count of Students:");
	int n=sc.nextInt();
	int arr [] = new int[n];
//	Collecting the student marks
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the marks of students:"+(i+1));
		arr[i]=sc.nextInt();
		System.out.println("--------");
	}
//	Displaying the marks
	System.out.println("============");
	for(int i=0;i<arr.length;i++) {
		System.out.println("the marks of students:"+(i+1)+"is="+arr[i]);
		System.out.println("--------");
	}
}
}
