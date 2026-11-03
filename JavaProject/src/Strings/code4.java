package Strings;
public class code4 {
	public static void main(String[] args) {
		String str="SachinRameshSTendulkars";
		String str1="              ";
		String str2="";
		System.out.println(str);
		System.out.println("---------------");
//		isBlank():Checks if the string is empty or contains spaces
		boolean blk=str.isBlank();
		System.out.println(blk);
		blk=str1.isBlank();
		System.out.println(blk);
		blk=str2.isBlank();
		System.out.println(blk);
		System.out.println("--------");
//		isEmpty():checks if the string is empty or not
		boolean empt=str.isEmpty();
		System.out.println(empt);
		empt=str1.isEmpty();
		System.out.println(empt);
		empt=str2.isEmpty();
		System.out.println(empt);
		System.out.println("--------");
//		replce():replaces the current character with new character
		String replace=str.replace('a','*');
		System.out.println(replace);
		replace=str.replace('z', '#');
		System.out.println(replace);
		System.out.println("--------");
	}
}
