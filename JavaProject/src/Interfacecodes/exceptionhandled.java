package Interfacecodes;

import java.util.Scanner;

class code1{
	void function1() throws Exception{
		System.out.println("Function-1 started");
		Scanner sc = new Scanner(System.in);
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
	    System.out.println("Function-1 terminated");
	}
}
class code2{
	void function2() throws Exception {
		System.out.println("Function-1 started");
		code1 c1=new code1();
		c1.function1();
		System.out.println("Function-1 terminated");
		
	}
}
class code3{
	void function3() throws Exception{
		System.out.println("Function-3 started");
		code2 c2=new code2();
		try {
			c2.function2();
		}
		catch (Exception e){
			System.out.println("function-3 handled Exception");
		}
		System.out.println("Function-3 terminated");
	}
}
class code4{
	void function4() throws Exception{
		System.out.println("Function-4 started");
		code3 c3=new code3();
		c3.function3();
		System.out.println("Function-4 terminated");
	}
}
public class exceptionhandled {
	public static void main(String[] args) {
		System.out.println("Main Started");
		code4 c4 =new code4();
		try {
			c4.function4();
		}
		catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Exception handled in Main");
		}
		System.out.println("Main Terminated");
		
	}
}
