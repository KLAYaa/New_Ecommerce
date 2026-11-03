
package gqt300;
public class checksorted {
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5};
		boolean sorted=true;
		for(int i=1;i<array.length;i++) {
			if(array[i]<array[i-1]) {
				sorted = false;
				break;
			}
		}
		if(sorted) {
			System.out.println("The array is sorted in ascending order.");
		}
		else {
			System.out.println("The array is not sorted in ascending order.");
		}
	}
}
