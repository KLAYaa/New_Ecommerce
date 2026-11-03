package gqt375pro;
import java.util.Scanner;

class Static25 {
    static String reverseText(String text) {

        if (text.length() <= 1) {
            return text;
        }

        return reverseText(text.substring(1))
                + text.charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String text = sc.nextLine();

        System.out.println("Original String: " + text);
        System.out.println("Reversed String: " +
                reverseText(text));
    }
}