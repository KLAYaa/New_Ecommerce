package gqt375pro;

import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > 0) {
                char first = words[i].charAt(0);

                if (first >= 'a' && first <= 'z') {
                    first = (char)(first - 32);
                }

                System.out.print(first + words[i].substring(1) + " ");
            }
        }
    }
}