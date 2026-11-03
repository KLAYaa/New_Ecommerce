package Strings;

public class equalignore {
	public static void main(String[] args) {
		String s1=new String("Virat");
		String s2=new String("Virat");
		String s3=new String("Anushka");
		String s4=new String("virat");
//		Above representation is Object Based representation
//		comparing s1 &s2
		if(s1.length()==s2.length()) {
			if(s1.equalsIgnoreCase(s2)) {
				System.out.println("String character are equal");
			}
			else {
				System.out.println("String character are not equal");
			}
		}
		else {
			System.out.println("String length are not equal");

		}
//		Compare s1 &s3
		if(s1.length()==s3.length()) {
			if(s1.equalsIgnoreCase(s3)) {
				System.out.println("String character are equal");
			}
			else {
				System.out.println("String character are not equal");
			}
		}
		else {
			System.out.println("String length are not equal");

		}
//		Compare s1 &s4
		if(s1.length()==s4.length()) {
			if(s1.equalsIgnoreCase(s4)) {
				System.out.println("String character are equal");
			}
			else {
				System.out.println("String character are not equal");
			}
		}
		else {
			System.out.println("String length are not equal");

		}
	}
}
