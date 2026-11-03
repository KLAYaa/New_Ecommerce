package gqt375pro;
import java.util.Scanner;

abstract class AbstractShape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class CircleFigure extends AbstractShape {
    double radius;

    CircleFigure(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class RectangleFigure extends AbstractShape {
    double length;
    double width;

    RectangleFigure(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Abstraction1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter circle radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter rectangle length: ");
        double length = sc.nextDouble();

        System.out.print("Enter rectangle width: ");
        double width = sc.nextDouble();

        AbstractShape circle = new CircleFigure(radius);
        AbstractShape rectangle = new RectangleFigure(length, width);

        System.out.println("Circle Area = " + circle.calculateArea());
        System.out.println("Circle Perimeter = " + circle.calculatePerimeter());

        System.out.println("Rectangle Area = " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter = " + rectangle.calculatePerimeter());
    }
}