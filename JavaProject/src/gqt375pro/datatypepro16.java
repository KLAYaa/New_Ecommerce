//Write a program to reverse a string without using any built-in methods.
package gqt375pro;
import java.util.Scanner;
public class datatypepro16 {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String reverse = "";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            reverse = reverse + str.charAt(i);
	        }

	        System.out.println("Original String: " + str);
	        System.out.println("Reversed String: " + reverse);
	    }
}

