package gqt375pro;
import java.util.Scanner;

class SquareArea {

    int area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        int side = sc.nextInt();

        SquareArea obj = new SquareArea();

        System.out.println("Area = " + obj.area(side));
    }
}