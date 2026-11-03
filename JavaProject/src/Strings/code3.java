package Strings;

public class code3 {
	public static void main(String[] args) {
		String str="SachinRameshSTendulkars";
		System.out.println(str);
		System.out.println("----------");
//	getBytes():It will provide an array of ascii values of the each character
		byte[] ar=str.getBytes();
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		System.out.println("---------");
//	getClass():returns the class to which the object belongs to a class
		Class cls=str.getClass();
		System.out.println(cls);
		System.out.println("---------");
//	hashCode():provides the unique value for the object that present in the string
		int hashCode=str.hashCode();
		System.out.println(hashCode);
		System.out.println("----------");
//	indexOf(Char c): provides the position value of the specified character
		int indx=str.indexOf("S");
		System.out.println(indx);
		indx=str.indexOf("R");
		System.out.println(indx);
		indx =str.indexOf("s");
		System.out.println(indx);
		indx=str.indexOf("z");
		System.out.println(indx);
		System.out.println("---------");
//	lastIndexOf(Char c): provides the last position value of the specified character
		indx=str.lastIndexOf("S");
		System.out.println(indx);
		indx=str.lastIndexOf("R");
		System.out.println(indx);
		indx=str.lastIndexOf("s");
		System.out.println(indx);
		indx=str.lastIndexOf("z");
		System.out.println(indx);
	}
}
