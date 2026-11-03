//to create the object by using anonymous inner type
package abstraction1;
abstract class Test1{
	abstract void add();
	abstract void div();
	void mul() {
		System.out.println("Mul()");
	}
	void sub() {
		System.out.println("sub()");
	}
}
public class Launch2 {
	public static void main(String[] args) {
//		Test1 t=new Test1();// error as we have unimplemented method inside 
//		Test1 t1;
		Test1 t2= new Test1() {
			@Override
			void div() {
				System.out.println("Div() form main");
			}
			
			@Override
			void add() {
				System.out.println("Add() form main");
			}
		};
		System.out.println(t2);
		t2.add();
		t2.mul();
		t2.sub();
		t2.div();
	}
}
