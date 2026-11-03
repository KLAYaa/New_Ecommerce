package Strings;
import java.util.Scanner;
public class countofcons {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		System.out.println("The collected String = "+str);
		int vow_cnt=0;
		int vow_cntup=0;
		int cons_cnt=0;
		int cons_cntup=0;
		int total_upper=0;
		int total_small=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' ||
				   str.charAt(i)=='I' || str.charAt(i)=='O' ||
				   str.charAt(i)=='U') {
					vow_cntup++;
				}
				else {
					cons_cntup++;
				}
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' ||
				   str.charAt(i)=='i' || str.charAt(i)=='o' ||
				   str.charAt(i)=='u') {
					vow_cnt++;
		     	}
				else {
					cons_cnt++;
				}
			}
		}
		total_small=vow_cnt+cons_cnt;
		total_upper=vow_cntup+cons_cntup;
		System.out.println("The uppercase Vowels = "+ vow_cntup);
		System.out.println("The lowercase vowels = "+vow_cnt);
		System.out.println("The uppercase consonant = "+ cons_cntup);
		System.out.println("The uppercase consonant = "+ cons_cnt);
		System.out.println("The total lowercase = "+ total_small );
		System.out.println("The total uppercase = "+ total_upper);
	}
}
