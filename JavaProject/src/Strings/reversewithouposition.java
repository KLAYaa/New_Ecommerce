//W.r.p to reverse the string without changing position of words
package Strings;

import java.util.Scanner;

public class reversewithouposition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		String s2[]=str.split(" ");
		System.out.println("----------");
		System.out.println("The collected String is= "+str);
		String new_str="";
		for(int i=0;i<s2.length;i++) {
			for(int j=s2[i].length()-1;j>=0;j--) {
				new_str=new_str+s2[i].charAt(j);
			}
			new_str = new_str + " ";
		}
		System.out.println("The Reversed string = "+new_str);
	}
}
