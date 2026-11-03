package gqt375pro;
import java.util.Scanner;

class Static14 {
    static double squareArea(double side) {
        return side * side;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter tile side: ");
        double side = sc.nextDouble();

        System.out.println("Square Area = " + squareArea(side));
    }
}