package gqt375pro;
abstract class Shape29 {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Triangle29 extends Shape29 {
    void calculateArea() {
        System.out.println("Triangle Area = 30");
    }

    void calculatePerimeter() {
        System.out.println("Triangle Perimeter = 24");
    }
}

class Circle29 extends Shape29 {
    void calculateArea() {
        System.out.println("Circle Area = 50.24");
    }

    void calculatePerimeter() {
        System.out.println("Circle Perimeter = 25.12");
    }
}

public class Abstract29 {
    public static void main(String[] args) {
        Shape29 s1 = new Triangle29();
        Shape29 s2 = new Circle29();

        s1.calculateArea();
        s1.calculatePerimeter();
        s2.calculateArea();
        s2.calculatePerimeter();
    }
}