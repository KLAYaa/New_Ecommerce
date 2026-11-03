//Write a program to check whether a given string is palindrome or not.
package gqt375pro;
import  java.util.Scanner;
public class datatype15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a string: ");
		String s = sc.nextLine(); String rev = ""; 
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		} 
		if (s.equals(rev)) 
				System.out.println("Palindrome");
		else 
			System.out.println("Not Palindrome");
	}
}
