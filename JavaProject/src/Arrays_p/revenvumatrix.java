package Arrays_p;

import java.util.Scanner;

public class revenvumatrix {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the language count: ");
	int lang =sc.nextInt();
	long investement =700000000l;
	long old_profit = 3000000000l;
	long invest_kannada=2500000000l;
	long invest_tamil=300000000l;
	long invest_hindi = 15000000000l;
//tamil hindi
	int arr[][]=new int[lang][];
	long overall_rev=0;
	long arr1[]=new long[lang];
	
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the movie count for lang no: " +(i+!));
		arr[i]=new long[sc.next()];
	}
	System.out.println("---------");
	for(int i=0;i<arr.length;i++) {
		System.out.println("Collecting data for language no: "+(i+1));
		long rev=0;
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Enter the revenue made by movie no: "+(j+1));
			arr[i][j]=sc.nextInt();
			rev=rev+arr[i][j];
			overall_rev=overall_rev+arr[i][j];
		}
		arr1[i]=rev;
	}
	System.out.println("-------");
	for(int i=0;i<arr.length;i++) {=
		System.out.println("Collecting data for language no "+(i+1));
		long rev=0;
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("The revenue made by th movie no: "+(j+1)+ " is = "+ arr[i][j]));
		}
	}
	System.out.println("---------------");
	for(int i=0;i<arr.length.i++) {
		System.out.println("The revenue made by lang no: "+(i+1)+ " is ="+ arr1[i]);
	}
}
}
