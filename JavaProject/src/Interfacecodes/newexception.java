package Interfacecodes;

import java.util.Scanner;

class Code5{
	void function8() throws Exception{
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
class Code6{
	void function7() throws Exception {
		System.out.println("Function-1 started");
		Code5 c1=new Code5();
		c1.function8();
		System.out.println("Function-1 terminated");
		
	}
}
class Code7{
	void function6() throws Exception{
		System.out.println("Function-3 started");
		Code6 c2=new Code6();
		try {
			c2.function7();
		}
		catch (Exception e){
			System.out.println("function-3 handled Exception");
			System.out.println("Function-3 terminated");
			throw e;
		}
		System.out.println("Function-3 terminated");
	}
}
class Code8{
	void function5() throws Exception{
		System.out.println("Function-4 started");
		Code7 c3=new Code7();
		c3.function6();
		System.out.println("Function-4 terminated");
	}
}
public class newexception {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Code8 c4 =new Code8();
		try {
			c4.function5();
		}
		catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Exception handled in Main");
		}
		System.out.println("Main Terminated");
		
	}
}
