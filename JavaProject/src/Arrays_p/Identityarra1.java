package Arrays_p;
import java.util.Scanner;
public class Identityarra1 {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size of matrix: ");
	int m1=sc.nextInt();
	int arr[]=new int[m1];
	for(int i=0;i<m1.length;i++) {
		for(int j=0;i<m1[i].length;j++) {
			if(i==j) {
				if(m1[i][j]!=1) {
					System.out.println("not identity");
					System.exit(0);
				}
			}
			else {
				if(m1[i][j]!=0) {
					System.out.println("not idntity");
					System.exit(0);
				}
			}
		}
	}
	System.out.println("It is Identity");
}
