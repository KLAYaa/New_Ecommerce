package gqt375pro;
import java.util.Scanner;

class AreaRectangle {

    int area(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        AreaRectangle obj = new AreaRectangle();

        System.out.println("Area = " + obj.area(length, breadth));
    }
}