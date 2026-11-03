package gqt375pro;
class Animal4 {
    void eat() {
        System.out.println("Animal eats");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog4 extends Animal4 {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat4 extends Animal4 {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Inheritance4 {
    public static void main(String[] args) {

        Dog4 d = new Dog4();
        Cat4 c = new Cat4();

        d.eat();
        d.sound();

        c.eat();
        c.sound();
    }
}