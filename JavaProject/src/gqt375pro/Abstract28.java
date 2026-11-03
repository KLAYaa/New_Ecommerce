package gqt375pro;
abstract class Transport28 {
    abstract void move();
}

class Bus28 extends Transport28 {
    void move() {
        System.out.println("Bus moves");
    }
}

class Train28 extends Transport28 {
    void move() {
        System.out.println("Train moves");
    }
}

public class Abstract28 {
    public static void main(String[] args) {
        Transport28 t1 = new Bus28();
        Transport28 t2 = new Train28();

        t1.move();
        t2.move();
    }
}