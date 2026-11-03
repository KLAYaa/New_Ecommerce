package Strings;
import java.util.Scanner;
public class vowelreplace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		System.out.println("The collected String = "+str);
//		int vow_cnt=0;
//		int vow_cntup=0;
		String spe="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' ||
				   str.charAt(i)=='I' || str.charAt(i)=='O' ||
				   str.charAt(i)=='U') {
//					vow_cntup++;
					spe=spe+"#";
				}
				else {
					spe=spe+str.charAt(i);
				}
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' ||
				   str.charAt(i)=='i' || str.charAt(i)=='o' ||
				   str.charAt(i)=='u') {
//					vow_cnt++;
					spe=spe+"#";
		     	}
				else {
					spe=spe+str.charAt(i);
				}
			}
		}
		System.out.println("After replaceing the string: ");
		System.out.println(spe);
	}

}
