package Strings;

import java.util.Scanner;

public class sumofcount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		System.out.println("The collected String = "+str);
		int vow_cnt=0;
		int vow_cntup=0;
		int cons_cnt=0;
		int cons_cntup=0;
		
		int vow_sum=0;
		int vowup_sum=0;
		int cons_sum=0;
		int consup_sum=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' ||
				   str.charAt(i)=='I' || str.charAt(i)=='O' ||
				   str.charAt(i)=='U') {
					vow_cntup++;
					vowup_sum=vowup_sum+str.charAt(i);
					vow_sum=vow_sum+str.charAt(i);
				}
				else {
					cons_cntup++;
					consup_sum=consup_sum+str.charAt(i);
				}
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' ||
				   str.charAt(i)=='i' || str.charAt(i)=='o' ||
				   str.charAt(i)=='u') {
					vow_cnt++;
					vow_sum=vow_sum+str.charAt(i);
		     	}
				else {
					cons_cnt++;
					cons_sum=cons_sum+str.charAt(i);
				}
			}
		}
		System.out.println("The uppercase Vowels = "+ vow_cntup);
		System.out.println("The lowercase vowels = "+vow_cnt);
		System.out.println("The uppercase consonant = "+ cons_cntup);
		System.out.println("The uppercase consonant = "+ cons_cnt);
		System.out.println("The total count of vowels = "+vow_sum);
	}
}
