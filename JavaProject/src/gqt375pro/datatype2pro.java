// w.r.p to perform arithmetic operations using float and double data type
package gqt375pro;
import java.util.Scanner;
public class datatype2pro {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		float a=sc.nextFloat();
		System.out.println("Enter the second number : ");
		double b= sc.nextDouble();
		double res=a+b;
		System.out.println("Addition operation = " + res);
		double res1 = a-b;
		System.out.println("Subtraction operation = " + res1);
		double res2=a*b;
		System.out.println("Multiplaction operation = " + res2);
		double res3 =a/b;
		System.out.println("Division operation = "+ res3);
	}
}
