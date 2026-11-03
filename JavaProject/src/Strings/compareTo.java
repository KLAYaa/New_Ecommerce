package Strings;

public class compareTo {
	public static void main(String[] args) {
		String s1="Virat";
		String s2="Virat";
		String s3="Anushka";
		String s4="virat";
//		Above representation is string literal representation
//		comparing s1 &s2
		if(s1.length()==s2.length()) {
			if(s1.compareTo(s2)==0) {
				System.out.println("String character are equal");
				System.out.println(s1.compareTo(s1));
			}
			else {
				System.out.println("String character are not equal");
				System.out.println(s1.compareTo(s2));
			}
		}
		else {
			System.out.println("String length are not equal");

		}
//		Compare s1 &s3
		if(s1.length()==s3.length()) {
			if(s1.compareTo(s3)==0) {
				System.out.println("String character are equal");
			}
			else {
				System.out.println("String character are not equal");
				System.out.println(s1.compareTo(s3));
			}
		}
		else {
			System.out.println("String length are not equal");

		}
//		Compare s1 &s4
		if(s1.length()==s4.length()) {
			if(s1.compareTo(s4)==0) {
				System.out.println("String character are equal");
			}
			else {
				System.out.println("String character are not equal");
				System.out.println(s1.compareTo(s4));
			}
		}
		else {
			System.out.println("String length are not equal");

		}
	}
}
