package Interfacecodes;

import java.util.Scanner;

class InvalidAccnoException extends Exception{
	@Override
	public String getMessage() {
		return "The entered account number i invalid";
	}
}
class InvalidPinException extends Exception{
	@Override
	public String getMessage() {
		return "The entered pin number is invalid..";
	}
}
class Customer{
	int accno = 44800;
	int pin = 9876;
	int acco_new;
	int pin_new;
	
	void collectDate() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the acco : ");
		acco_new =sc.nextInt();
		System.out.println("Enter the pin : ");
		pin_new = sc.nextInt();
	}
	void validation() throws Exception{
		if(accno == acco_new) {
			if(pin==pin_new) {
				System.out.println("Valid User");
			}
			else {
				InvalidPinException ipe = new InvalidPinException();
				System.out.println(ipe.getMessage());
				throw ipe;
				
			}
		}
		else {
			InvalidAccnoException iae = new InvalidAccnoException();
			System.out.println(iae.getMessage());
			throw iae;
		}
	}
}
class ATM{
	void transaction(Customer c) {
		try {
			c.collectDate();
			c.validation();
		}
		catch (Exception e1) {
			try {
				c.collectDate();
				c.validation();
			}
			catch (Exception e2) {
				try {
					c.collectDate();
					c.validation();
				}
				catch (Exception e3) {
					System.out.println("User is Blocked");
					System.exit(0);
				}
			}
		}
	}
}
public class ownexception {
	public static void main(String[] args) {
		Customer c1= new Customer();
		ATM a = new ATM();
		a.transaction(c1);
	}
	
}
