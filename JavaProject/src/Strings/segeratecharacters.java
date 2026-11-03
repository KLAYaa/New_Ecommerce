package Strings;
import java.util.Scanner;
public class segeratecharacters {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		String alphabet="";
		String number="";
		String sp_string="";
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>=65 && str.charAt(i)<=90) ||
				(str.charAt(i)>=97 && str.charAt(i)<=122)) {
				alphabet=alphabet+str.charAt(i);
			}
			else if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				number = number+str.charAt(i);
			}
			else {
				sp_string=sp_string+str.charAt(i);
			}
		}
		System.out.println("The alphabets are: "+alphabet);
		System.out.println("The numbers are : "+number);
		System.out.println("The special charcters are: "+sp_string);
	}
}
