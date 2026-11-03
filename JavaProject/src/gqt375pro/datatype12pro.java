//Write a program to convert a string to integer and vice versa.
package gqt375pro;
import java.util.Scanner;
public class datatype12pro {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number as String: "); 
		String s = sc.nextLine(); 
		int num = Integer.parseInt(s); 
		System.out.println("String to Integer = " + num); 
		System.out.print("Enter an integer: "); 
		int n = sc.nextInt(); 
		String str = Integer.toString(n);
		System.out.println("Integer to String = " + str);
	}
}
