package gqt375pro;
import java.util.Scanner;

class RectanglePerimeter {

    int perimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        RectanglePerimeter obj = new RectanglePerimeter();

        System.out.println("Perimeter = " +
                obj.perimeter(length, breadth));
    }
}