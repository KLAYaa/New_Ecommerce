package gqt375pro;
class Shape9 {
    String type;
    String color;
}

class Circle9 extends Shape9 {
    double radius;
    double area;
}

public class Inheritance29 {
    public static void main(String[] args) {

        Circle9 c = new Circle9();

        c.type = "Circle";
        c.color = "Red";
        c.radius = 5;
        c.area = 3.14 * c.radius * c.radius;

        System.out.println(c.type);
        System.out.println(c.color);
        System.out.println(c.radius);
        System.out.println(c.area);
    }
}