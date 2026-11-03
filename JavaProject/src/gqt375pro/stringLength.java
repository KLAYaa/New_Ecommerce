package gqt375pro;
import java.util.Scanner;
public class stringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = str.length();

        System.out.println("Length of string: " + length);
    }
}