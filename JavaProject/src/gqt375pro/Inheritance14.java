package gqt375pro;
class Shape14 {
    String type = "Shape";
    String color = "Blue";
}

class Triangle14 extends Shape14 {
    double area = 30;
}

public class Inheritance14 {
    public static void main(String[] args) {

        Shape14 s = new Shape14();
        Triangle14 t = new Triangle14();

        System.out.println("Shape: " + s.type + " " + s.color);
        System.out.println("Triangle: " + t.type + " " + t.color + " " + t.area);
    }
}