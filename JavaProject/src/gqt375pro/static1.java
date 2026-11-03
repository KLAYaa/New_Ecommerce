package gqt375pro;
import java.util.Scanner;

class BookCounter {
    static int objectCount = 0;

    BookCounter() {
        objectCount++;
    }
}

public class static1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many books to create? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            new BookCounter();
        }

        System.out.println("Number of objects created: " + BookCounter.objectCount);
    }
}