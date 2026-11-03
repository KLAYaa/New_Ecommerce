package gqt375pro;
abstract class Shape23 {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Rectangle23 extends Shape23 {
    void calculateArea() {
        System.out.println("Area = " + (8 * 5));
    }

    void calculatePerimeter() {
        System.out.println("Perimeter = " + (2 * (8 + 5)));
    }
}

class Square23 extends Shape23 {
    void calculateArea() {
        System.out.println("Area = " + (6 * 6));
    }

    void calculatePerimeter() {
        System.out.println("Perimeter = " + (4 * 6));
    }
}

public class Abstract23 {
    public static void main(String[] args) {
        Shape23 s1 = new Rectangle23();
        Shape23 s2 = new Square23();

        s1.calculateArea();
        s1.calculatePerimeter();
        s2.calculateArea();
        s2.calculatePerimeter();
    }
}