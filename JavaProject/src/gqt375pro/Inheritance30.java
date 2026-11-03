package gqt375pro;
class Shape30 {
    String type = "Shape";
    String color = "Blue";
}

class Circle30 extends Shape30 {
    double radius = 7;
}

public class Inheritance30 {
    public static void main(String[] args) {

        Shape30 s = new Shape30();
        Circle30 c = new Circle30();

        System.out.println(s.type + " " + s.color);
        System.out.println(c.type + " " + c.color + " " + c.radius);
    }
}