package gqt375pro;
abstract class Payment20 {
    abstract void pay();
}

class Cash20 extends Payment20 {
    void pay() {
        System.out.println("Payment by Cash");
    }
}

class Card20 extends Payment20 {
    void pay() {
        System.out.println("Payment by Card");
    }
}

public class Abstract20 {
    public static void main(String[] args) {
        Payment20 p1 = new Cash20();
        Payment20 p2 = new Card20();

        p1.pay();
        p2.pay();
    }
}