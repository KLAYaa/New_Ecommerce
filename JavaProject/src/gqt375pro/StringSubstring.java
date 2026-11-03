package gqt375pro;
import java.util.Scanner;

public class StringSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        System.out.print("Enter string to search: ");
        String sub = sc.nextLine();

        if (str.contains(sub)) {
            System.out.println("Substring is present.");
        } else {
            System.out.println("Substring is not present.");
        }
    }
}