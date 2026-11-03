
package gqt300;
public class MaxElement {
	public static void main(String[] args) {
		int[] array= {5,2,8,1,6};
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("Maxamum element in the array: "+max);
	}
}
