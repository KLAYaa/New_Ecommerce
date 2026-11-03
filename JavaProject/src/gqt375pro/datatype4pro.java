// w.r.p to perform operations on characters such as converting lower case to upper case & vice versa
package gqt375pro;
import java.util.Scanner;
public class datatype4pro {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a character: "); 
		char ch = sc.next().charAt(0); 
		if (ch >= 'a' && ch <= 'z') { 
			System.out.println("Uppercase = " + (char)(ch - 32)); 
		} 
		else if (ch >= 'A' && ch <= 'Z') { 
			System.out.println("Lowercase = " + (char)(ch + 32)); 
		} 
		else { 
			System.out.println("It is not an alphabet");
		} 
	}
}
