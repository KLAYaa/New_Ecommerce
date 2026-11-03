// w.r.p to convert an integer to binary and vice versa
package gqt375pro;
import java.util.Scanner;
public class datatype3pro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: "); 
		int n = sc.nextInt(); 
		int temp = n; 
		int binary = 0; 
		int place = 1; 
		while (temp > 0) { 
			int remainder = temp % 2; 
			binary = binary + remainder * place; 
			place = place * 10; 
			temp = temp / 2;
		} 
		System.out.println("Binary = " + binary); 
		int decimal = 0; 
		int base = 1; 
		temp = binary; 
		while (temp > 0) { 
			int digit = temp % 10; 
			decimal = decimal + digit * base; 
			base = base * 2; 
			temp = temp / 10;
		} 
		System.out.println("Integer = " + decimal); 
	}
}
