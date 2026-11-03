package gqt375pro;
abstract class Shape11 {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Triangle11 extends Shape11 {
    void calculateArea() {
        System.out.println("Triangle Area = " + (10 * 6 / 2));
    }

    void calculatePerimeter() {
        System.out.println("Triangle Perimeter = 24");
    }
}

class Circle11 extends Shape11 {
    void calculateArea() {
        System.out.println("Circle Area = " + (3.14 * 4 * 4));
    }

    void calculatePerimeter() {
        System.out.println("Circle Perimeter = " + (2 * 3.14 * 4));
    }
}

public class Abstract11 {
    public static void main(String[] args) {
        Shape11 s1 = new Triangle11();
        Shape11 s2 = new Circle11();

        s1.calculateArea();
        s1.calculatePerimeter();
        s2.calculateArea();
        s2.calculatePerimeter();
    }
}