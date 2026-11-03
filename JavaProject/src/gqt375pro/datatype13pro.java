//Write a program to demonstrate the use of string methods such as substring, indexOf, and equals.
package gqt375pro;
import java.util.Scanner;
public class datatype13pro {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a string: "); 
		String s = sc.nextLine(); 
		System.out.print("Enter starting index for substring: "); 
		int start = sc.nextInt(); 
		sc.nextLine(); 
		System.out.print("Enter a string to find: "); 
		String find = sc.nextLine(); 
		System.out.print("Enter a string to compare: "); 
		String compare = sc.nextLine(); 
		System.out.println("Substring = " + s.substring(start)); 
		System.out.println("Index = " + s.indexOf(find)); 
		System.out.println("Equals = " + s.equals(compare));
	}
}
