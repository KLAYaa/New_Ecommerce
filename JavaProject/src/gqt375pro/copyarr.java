package gqt375pro;
import java.util.Scanner;
public class copyarr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter a array: ");
		int arr[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]=arr[i];
		}
		System.out.println("Copied array: ");
		for(int i=0;i<n;i++) {
			System.out.print(b[i]+" ");
		}
	}
}
