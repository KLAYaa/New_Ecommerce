//Write a program to demonstrate the use of wrapper classes in Java.
package gqt375pro;
import java.util.Scanner;
public class datatype11pro {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter an integer: "); 
		int a = sc.nextInt();
		Integer obj = a; 
		int b = obj; 
		System.out.println("Primitive value = " + a); 
		System.out.println("Wrapper object = " + obj); 
		System.out.println("Unboxed value = " + b);
	}
}
