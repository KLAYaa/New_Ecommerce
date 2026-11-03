//Write a program to demonstrate the use of StringBuilder class.
package gqt375pro;
import java.util.Scanner;
public class datatype18 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Original String: " + sb);
        // Append
        sb.append(" Java");
        System.out.println("After append: " + sb);
        // Insert
        sb.insert(0, "Hello ");
        System.out.println("After insert: " + sb);
        // Replace
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);
        // Delete
        sb.delete(0, 3);
        System.out.println("After delete: " + sb);
        // Reverse
        sb.reverse();
       System.out.println("After reverse: " + sb);
	}
}
