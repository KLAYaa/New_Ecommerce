package Interfacecodes;

import java.util.Scanner;

class UnderAgeException extends Exception{
	@Override
	public String getMessage() {
		return "The Entered age is less";
	}
}
class BeyondAgeException extends Exception{
	@Override
	public String getMessage() {
		return "The age is more than Reqired...";
	}
}
class Age{
	int age;
	void Agevalid() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age : ");
		age= sc.nextInt();
	}
	void AgeExc()throws Exception {
		if( age>18 && age<40) {
			System.out.println("valid age ");
		}
		else if(age<18) {
			UnderAgeException uae =new  UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>40){
			BeyondAgeException bae=new BeyondAgeException();
			System.out.println(bae.getMessage());
			throw bae;
		}
	}
}
class ValiAge{
	void reqAge(Age a) {
		try {
			a.Agevalid();
			a.AgeExc();
		}
		catch (Exception e11) {
			try {
				a.Agevalid();
				a.AgeExc();
			}
			catch (Exception e12) {
				try {
					a.Agevalid();
					a.AgeExc();
				}
				catch (Exception e13) {
					System.out.println("Age is undefined...");
					System.exit(0);
				}
			}
		}
	}
}
public class ageException {
	public static void main(String[] args) throws Exception{
		Age a1= new Age();
//		a1.Agevalid();
		ValiAge v = new ValiAge();
		v.reqAge(a1);
	}
}
