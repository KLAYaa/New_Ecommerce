package gqt375pro;
interface Flyable4 {
    void fly();
}

interface Swimable4 {
    void swim();
}

class Eagle4 implements Flyable4 {
    public void fly() {
        System.out.println("Eagle flies high");
    }
}

class Shark4 implements Swimable4 {
    public void swim() {
        System.out.println("Shark swims fast");
    }
}

public class Interface4 {
    public static void main(String[] args) {
        Eagle4 e = new Eagle4();
        Shark4 s = new Shark4();

        e.fly();
        s.swim();
    }
}