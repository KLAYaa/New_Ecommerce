import java.util.Scanner;
public class Pattern32J {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("End the Size:");
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if( j ==(n/2) || i==0 || i==(n-1)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
