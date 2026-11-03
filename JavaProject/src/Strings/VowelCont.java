package Strings;

import java.util.Scanner;

public class VowelCont {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		System.out.println("-----------");
		System.out.println("The collected string is = "+ str);
		str=str.toUpperCase();
		int vow_cnt=0;
		int cons_cnt=0;
		int spl_cnt=0;
		int num_cnt=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' ||
				   str.charAt(i)=='I' || str.charAt(i)=='O' ||
				   str.charAt(i)=='U') {
					vow_cnt++;
				}
				else {
					cons_cnt++;
				}
			}
			else if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				num_cnt++;
			}
			else {
				spl_cnt++;
			}
		}
		System.out.println("------------");
		System.out.println("Vowel count = "+vow_cnt);
		System.out.println("Consonant Count = "+ cons_cnt);
		System.out.println("Number count = "+num_cnt);
		System.out.println("Special Character count = "+spl_cnt);
	}
}
