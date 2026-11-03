package Strings;
//non constant pool with references
public class str4 {
	public static void main(String[] args) {
		String s1=new String("Virat");
		String s2=new String("Virat");
		String s3=new String("Anushka");
		String s4=new String("virat");
//		Above representation is Object Based representation
//		comparing s1 &s2
		if(s1==s2) {
			System.out.println("References are Equal");
		}
		else {
			System.out.println("References are not Equal");
		}
		System.out.println("-----------------");
		
//		comparing s1 &s3
		if(s1==s3) {
			System.out.println("References are Equal");
		}
		else {
			System.out.println("References are not Equal");
		}
		System.out.println("-----------------");
		
//		comparing s1 &s4
		if(s1==s4) {
			System.out.println("References are Equal");
		}
		else {
			System.out.println("References are not Equal");
		}
	}
}
