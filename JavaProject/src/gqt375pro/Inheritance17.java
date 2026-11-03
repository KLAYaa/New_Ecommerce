package gqt375pro;

class Fruit17 {
    String name;
    String color;
}

class Apple17 extends Fruit17 {
    String taste;
    String size;
}

class Banana17 extends Fruit17 {
    String taste;
    String size;
}

public class Inheritance17 {
    public static void main(String[] args) {

        Apple17 a = new Apple17();
        a.name = "Apple";
        a.color = "Red";
        a.taste = "Sweet";
        a.size = "Medium";

        Banana17 b = new Banana17();
        b.name = "Banana";
        b.color = "Yellow";
        b.taste = "Sweet";
        b.size = "Large";

        System.out.println(a.name + " " + a.color + " " +
                           a.taste + " " + a.size);

        System.out.println(b.name + " " + b.color + " " +
                           b.taste + " " + b.size);
    }
}