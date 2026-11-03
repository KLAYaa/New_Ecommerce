package gqt375pro;

import java.util.Scanner;

class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().toLowerCase();

        boolean pangram = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {

            if (str.indexOf(ch) == -1) {
                pangram = false;
                break;
            }
        }

        if (pangram) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a Pangram");
        }
    }
}