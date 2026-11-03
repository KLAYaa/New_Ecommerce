package gqt375pro;
abstract class Account7 {
    abstract void deposit();
    abstract void withdraw();
}

class Savings7 extends Account7 {
    void deposit() { System.out.println("Savings deposit"); }
    void withdraw() { System.out.println("Savings withdrawal"); }
}

class Current7 extends Account7 {
    void deposit() { System.out.println("Current deposit"); }
    void withdraw() { System.out.println("Current withdrawal"); }
}

public class Abstract7 {
    public static void main(String[] args) {
        Account7 a1 = new Savings7();
        Account7 a2 = new Current7();

        a1.deposit();
        a1.withdraw();
        a2.deposit();
        a2.withdraw();
    }
}