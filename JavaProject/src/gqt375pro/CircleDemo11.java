package gqt375pro;
import java.util.Scanner;

class Circle {
    private double radius;
    private double area;
    private double circumference;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getCircumference() {
        return circumference;
    }
}

public class CircleDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        c.setRadius(radius);

        c.setArea(Math.PI * radius * radius);
        c.setCircumference(2 * Math.PI * radius);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " +
                c.getCircumference());
    }
}