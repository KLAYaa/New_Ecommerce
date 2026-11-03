package Strings;

import java.util.Scanner;

public class palindrom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		System.out.println("----------");
		System.out.println("The collected String is= "+str);
		String new_str="";
		for(int i=str.length()-1;i>=0;i--) {
			new_str=new_str+str.charAt(i);
		}
		System.out.println("The Reversed string = "+new_str);
		System.out.println("-----------");
		if(str.equals(new_str)) {
			System.out.println("The string is palindrom");
		}
		else {
			System.out.println("The string is not palindrom ");
		}
	}
}
