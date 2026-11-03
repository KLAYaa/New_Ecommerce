package gqt375pro;
import java.util.Scanner;
public class duplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the arrays: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("After remove Duplicates: ");
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==0)
				System.out.print(arr[i] + " ");
		}
	}
}

