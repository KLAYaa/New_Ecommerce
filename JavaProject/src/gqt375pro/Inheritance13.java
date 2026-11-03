package gqt375pro;
class Shape13 {
    String type;
    String color;
}

class Triangle13 extends Shape13 {
    double base;
    double height;
}

public class Inheritance13 {
    public static void main(String[] args) {

        Triangle13 t = new Triangle13();

        t.type = "Triangle";
        t.color = "Green";
        t.base = 10;
        t.height = 6;

        System.out.println(t.type);
        System.out.println(t.color);
        System.out.println(t.base);
        System.out.println(t.height);
    }
}