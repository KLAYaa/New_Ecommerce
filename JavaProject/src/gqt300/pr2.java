
package gqt300;
public class pr2 {
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum +=array[i];
		}
		double average=(double) sum/array.length;
		System.out.println("Average of elements in the array: "+ average);
	}
}
