package gqt375pro;
abstract class Transport10 {
    abstract void move();
}

class Bus10 extends Transport10 {
    void move() {
        System.out.println("Bus moves on road");
    }
}

class Train10 extends Transport10 {
    void move() {
        System.out.println("Train moves on track");
    }
}

public class Abstract10 {
    public static void main(String[] args) {
        Transport10 t1 = new Bus10();
        Transport10 t2 = new Train10();

        t1.move();
        t2.move();
    }
}