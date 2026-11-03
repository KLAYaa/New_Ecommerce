package gqt375pro;
abstract class Payment4 {
    abstract void pay();
}

class UPI4 extends Payment4 {
    void pay() {
        System.out.println("Payment through UPI");
    }
}

class Card4 extends Payment4 {
    void pay() {
        System.out.println("Payment through Card");
    }
}

public class Abstract4 {
    public static void main(String[] args) {
        Payment4 p1 = new UPI4();
        Payment4 p2 = new Card4();

        p1.pay();
        p2.pay();
    }
}