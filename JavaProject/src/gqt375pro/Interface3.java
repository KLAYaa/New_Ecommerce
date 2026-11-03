package gqt375pro;

interface Flyable3 {
    void fly();
}

interface Swimable3 {
    void swim();
}

class Bird3 implements Flyable3 {
    public void fly() {
        System.out.println("Bird flies");
    }
}

class Fish3 implements Swimable3 {
    public void swim() {
        System.out.println("Fish swims");
    }
}

public class Interface3 {
    public static void main(String[] args) {
        new Bird3().fly();
        new Fish3().swim();
    }
}