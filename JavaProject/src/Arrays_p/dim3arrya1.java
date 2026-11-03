package Arrays_p;

import java.util.Scanner;

public class dim3arrya1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Schools:-");
		int scl=sc.nextInt();
		System.out.println("Enter the no of classes in a School:-");
		int cls=sc.nextInt();
		System.out.println("Enter the no of students in each class of the Schools:-");
		int std= sc.nextInt();
//		creating the array
		int arr[][][]=new int[scl][cls][std];
		
//		collecting the data
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the School No: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the class No: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the marks of student no: "+(k+1));
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		System.out.println("================");
        //displaying the data
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the School No: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the class No: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The marks of student no: "+(k+1) + "is = "+arr[i][j][k]);
				}
			}
		}
	}
}
