package gqt375pro;
abstract class Animal3 {
    abstract void eat();
    abstract void sleep();
}

class Dog3 extends Animal3 {
    void eat() { System.out.println("Dog eats bones"); }
    void sleep() { System.out.println("Dog sleeps"); }
}

class Cat3 extends Animal3 {
    void eat() { System.out.println("Cat eats fish"); }
    void sleep() { System.out.println("Cat sleeps"); }
}

public class Abstraction3 {
    public static void main(String[] args) {
        Animal3 a1 = new Dog3();
        Animal3 a2 = new Cat3();

        a1.eat();
        a1.sleep();
        a2.eat();
        a2.sleep();
    }
}