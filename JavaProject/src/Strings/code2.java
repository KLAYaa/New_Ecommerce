package Strings;

public class code2 {
	public static void main(String[] args) {
		String str="SachinRameshTendulkar";
		System.out.println(str);
		System.out.println("--------");
//		contains(String s): checks if the sub-string is present 
		boolean res1=str.contains("Ramesh");
		System.out.println(res1);
		System.out.println("-----------");
		res1=str.contains("ramesh");
		System.out.println(res1);
		System.out.println("-------------");
		res1=str.contains("Umesh");
		System.out.println(res1);
		System.out.println("##########");
//		endsWith(String s): checks if the main string ends with the given sub-string 
		boolean res2=str.endsWith("Tendulkar");
		System.out.println(res2);
		System.out.println("--------");
		res2=str.endsWith("kar");
		System.out.println(res2);
		System.out.println("---------");
		res2=str.endsWith("pendulkar");
		System.out.println(res2);
		System.out.println("###########");
//		startsWith(String): checks if the main string with the given sub-string
		boolean res3=str.startsWith("Sachin");
		System.out.println(res3);
		System.out.println("-----------");
		res3=str.startsWith("Sac");
		System.out.println(res3);
		System.out.println("-----------");
		res3=str.startsWith("Pachin");
		System.out.println(res3);
		System.out.println("#######");
//		toUpperCase(): convert the main string into upper case
		String upper=str.toUpperCase();
		System.out.println(upper);
		System.out.println("#######");
//		toLowercase(): conver the main string into lower case
		String lower=str.toLowerCase();
		System.out.println(lower);
	}
}
