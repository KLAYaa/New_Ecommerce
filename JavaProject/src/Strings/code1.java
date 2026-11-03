package Strings;

public class code1 {
	public static void main(String[] args) {
	String str="SachinRameshTendulkar";
	System.out.println(str);
	System.out.println("-----------------");
//	1.length()
	int length=str.length();
	System.out.println("the length of string is= "+length);
	System.out.println("--------------");
//	2.charat(int i)
	char c1=str.charAt(0);
	System.out.println(c1);
	c1=str.charAt(length-1);
	System.out.println(c1);
//	c1=str.charAt(100); ---->Index out of bound   leads to exception
//	System.out.println(c1);
	System.out.println("----------------");
//	3.concat(String s)
	String new_str=str.concat("is the best batsman");
	System.out.println(str);
	System.out.println(new_str);
	String new_str1=str+" Hello world";
	System.out.println(new_str1);
	System.out.println(str);
	str=str+"This is by + operater";
	System.out.println(str);
	}
}
