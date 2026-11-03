package gqt375pro;
class Shape3 {
    void area() {
        System.out.println("Shape Area");
    }

    void perimeter() {
        System.out.println("Shape Perimeter");
    }
}

class Circle3 extends Shape3 {
    void area() {
        System.out.println("Circle Area = 78.5");
    }

    void perimeter() {
        System.out.println("Circle Perimeter = 31.4");
    }
}

class Rectangle3 extends Shape3 {
    void area() {
        System.out.println("Rectangle Area = 40");
    }

    void perimeter() {
        System.out.println("Rectangle Perimeter = 26");
    }
}

public class Inheritance3 {
    public static void main(String[] args) {

        Circle3 c = new Circle3();
        Rectangle3 r = new Rectangle3();

        c.area();
        c.perimeter();

        r.area();
        r.perimeter();
    }
}