package gqt375pro;
import java.util.Scanner;
class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            words[i] = sc.nextLine();
        }

        String prefix = words[0];

        for (int i = 1; i < n; i++) {

            while (!words[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.length() == 0) {
                    break;
                }
            }
        }

        System.out.println("Longest Common Prefix: " + prefix);
    }
}