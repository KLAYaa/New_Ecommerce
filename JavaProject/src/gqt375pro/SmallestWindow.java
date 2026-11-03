package gqt375pro;
import java.util.Scanner;

public class SmallestWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        System.out.print("Enter required characters: ");
        String target = sc.nextLine();

        String smallest = "";

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String window = str.substring(i, j);

                boolean containsAll = true;

                for (int k = 0; k < target.length(); k++) {
                    if (window.indexOf(target.charAt(k)) == -1) {
                        containsAll = false;
                        break;
                    }
                }

                if (containsAll &&
                    (smallest.equals("") ||
                     window.length() < smallest.length())) {

                    smallest = window;
                }
            }
        }

        if (smallest.equals("")) {
            System.out.println("No window found.");
        } else {
            System.out.println("Smallest Window: " + smallest);
        }
    }
}