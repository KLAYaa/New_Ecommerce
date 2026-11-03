package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String s1=sc.next();
		System.out.println("Enter the second String: ");
		String s2=sc.next();
		char c1[]=new char[s1.length()];
		char c2[] = new char[s2.length()];
//		step-1: check the length of string
		if(s1.length()==s2.length()) {
//			step-2: convert the string into character array
			for(int i=0;i<s1.length();i++) {
				c1[i]=s1.charAt(i);
			}
			for(int i=0;i<s2.length();i++) {
				c2[i]=s2.charAt(i);
			}
//	<-----		simple way to convert array---->
//			c1=s1.toCharArray();
//			c2=s2.toCharArray();
//		step-3: sort the array
			Arrays.sort(c1);
			Arrays.sort(c2);
//			step-4: check the equality 
			if(Arrays.equals(c1, c2)==true) {
				System.out.println("Strings are Anagrams");
			}
			else {
				System.out.println("Strings are not Anagrams");
			}
		}
		else {
			System.out.println("Strings are not anagroms");
		}
	}
}
