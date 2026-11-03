package Strings;

import java.util.Scanner;

public class covertuppertolowersame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		String upper="";
		String lower="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				upper=str.toUpperCase();
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				lower=str.toLowerCase();
			}
		}
		System.out.println("The converted to upper case: "+upper);
		System.out.println("the converted to lowercase: "+ lower);
	}
}
