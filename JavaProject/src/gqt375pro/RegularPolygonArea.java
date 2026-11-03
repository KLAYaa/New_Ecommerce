package gqt375pro;
import java.util.Scanner;
class RegularPolygonArea {
    double area(int sides, double sideLength) {
        return (sides * sideLength * sideLength) /
               (4 * Math.tan(Math.PI / sides));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sides: ");
        int sides = sc.nextInt();
        System.out.print("Enter side length: ");
        double sideLength = sc.nextDouble();
        RegularPolygonArea obj = new RegularPolygonArea();
        System.out.println("Area = " +
                obj.area(sides, sideLength));
    }
}