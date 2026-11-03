package gqt375pro;
class Shape24 {
    String type = "Shape";
    String color = "Yellow";
}

class Rectangle24 extends Shape24 {
    double length = 10;
    double width = 4;
}

public class Inheritance24 {
    public static void main(String[] args) {

        Shape24 s = new Shape24();
        Rectangle24 r = new Rectangle24();

        System.out.println("Shape: " + s.type + " " + s.color);
        System.out.println("Rectangle: " + r.type + " " +
                           r.color + " " + r.length + " " + r.width);
    }
}