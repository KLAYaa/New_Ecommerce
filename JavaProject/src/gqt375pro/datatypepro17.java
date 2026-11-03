//Write a program to convert a string to uppercase and vice versa.
package gqt375pro;
import java.util.Scanner;
public class datatypepro17 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a string: "); 
		String str = sc.nextLine(); 
		String upper = ""; 
		String lower = ""; 
		for (int i = 0; i < str.length(); i++) { 
			char ch = str.charAt(i); 
			// Convert lowercase to uppercase 
			if (ch >= 'a' && ch <= 'z') { 
				upper = upper + (char)(ch - 32); 
			}
			else { 
				upper = upper + ch; 
			} // Convert uppercase to lowercase 
			if (ch >= 'A' && ch <= 'Z') {
				lower = lower + (char)(ch + 32); 
			} 
			else {
				lower = lower + ch;
			} 
		 System.out.println("Uppercase: " + upper); 
		 System.out.println("Lowercase: " + lower); 
		}
	}
}
