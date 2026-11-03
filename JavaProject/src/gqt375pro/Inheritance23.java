package gqt375pro;
class Shape2 {
    String type;
    String color;
}

class Rectangle2 extends Shape2 {
    double length;
    double width;
}

public class Inheritance23 {
    public static void main(String[] args) {

        Rectangle2 r = new Rectangle2();

        r.type = "Rectangle";
        r.color = "Green";
        r.length = 12;
        r.width = 5;

        System.out.println(r.type);
        System.out.println(r.color);
        System.out.println(r.length);
        System.out.println(r.width);
    }
}