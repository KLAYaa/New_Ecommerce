package Interfacecodes;

import java.util.Scanner;

public class trycatchfinally {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
			System.out.println("Division Operation Started");
			System.out.println("Enter the numerator : ");
			int num=sc.nextInt();//critical Statement : InputMismatchExceptionInputMismatchException
			System.out.println("Enter the denominator : ");
			int den=sc.nextInt(); //critical Statement : InputMismatchException
			int res=num/den;  //critical Statement :  ArithmeticException
			System.out.println("Result = "+ res);
			System.out.println("Division Operation Completed..");
			System.out.println("-------------------------");
			System.out.println("Array Operation Started");
			System.out.println("Enter the array size : ");
			int n=sc.nextInt(); //critical Statement : InputMismatchException
			int arr[] = new int[n]; //critical Statement :  NegativeArraySizeException
			System.out.println("Enter the position : ");
			int pos=sc.nextInt(); //critical Statement : InputMismatchException
			System.out.println("Enter the value : ");
			int val=sc.nextInt(); //critical Statement : InputMismatchException
			arr[pos]=val; //critical Statement :  ArrayIndexOutOfBoundsException
			System.out.println("Array Operation Completed...");
		}
		catch(Exception e) {
			System.out.println("Exception handled by catch block");
		}
		finally{
			System.out.println("hi hello from Finally");
		}
	}
}
