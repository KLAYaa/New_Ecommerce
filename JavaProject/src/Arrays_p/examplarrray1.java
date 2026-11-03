package Arrays_p;

import java.util.Scanner;

public class examplarrray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of buniness:-");
		int bus=sc.nextInt();
		System.out.println("Enter the number Location:-");
		int loc=sc.nextInt();
		System.out.println("Enter the number of Branches in each loaction:-");
		int bran= sc.nextInt();
//		creating the array
		int arr[][][]=new int[bus][loc][bran];
		int total=0;
//		collecting the data
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the Business " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("In location "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the Number of Facuties reqired : "+(k+1));
					arr[i][j][k]=sc.nextInt();
					total=total+arr[i][j][k];
				}
			}
		}
		System.out.println("================");
        //displaying the data
		for(int i=0;i<arr.length;i++) {
			System.out.println("In Business: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("In location: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The staff reqired in branch : "+(k+1) + " is = "+arr[i][j][k]);
				}
			}
		}
		System.out.println("---------------");
		System.out.println("Total number of staff reqired is : " + total);		
	}
}
