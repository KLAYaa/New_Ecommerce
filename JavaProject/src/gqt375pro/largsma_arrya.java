package gqt375pro;
import java.util.Scanner;
public class largsma_arrya {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			 if (arr[i] < smallest) {
	                smallest = arr[i];
	            }
		}
		System.out.println("Largest number: "+largest);
		System.out.println("Smallest number: "+smallest);
	}
}


