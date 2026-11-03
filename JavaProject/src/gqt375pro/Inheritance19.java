package gqt375pro;
class Animal19 {
    String name;
    String type;
}

class Dog19 extends Animal19 {
    String breed;
}

class Cat19 extends Animal19 {
    String color;
}

public class Inheritance19 {
    public static void main(String[] args) {

        Dog19 d = new Dog19();
        d.name = "Rocky";
        d.type = "Dog";
        d.breed = "Beagle";

        Cat19 c = new Cat19();
        c.name = "Luna";
        c.type = "Cat";
        c.color = "White";

        System.out.println(d.name + " " + d.type + " " + d.breed);
        System.out.println(c.name + " " + c.type + " " + c.color);
    }
}