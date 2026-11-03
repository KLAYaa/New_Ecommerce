package gqt375pro;
abstract class Account19 {
    abstract void deposit();
    abstract void withdraw();
}

class SavingsAccount19 extends Account19 {
    void deposit() {
        System.out.println("Amount deposited in Savings Account");
    }

    void withdraw() {
        System.out.println("Amount withdrawn from Savings Account");
    }
}

class CurrentAccount19 extends Account19 {
    void deposit() {
        System.out.println("Amount deposited in Current Account");
    }

    void withdraw() {
        System.out.println("Amount withdrawn from Current Account");
    }
}

public class Abstract19 {
    public static void main(String[] args) {
        Account19 a1 = new SavingsAccount19();
        Account19 a2 = new CurrentAccount19();

        a1.deposit();
        a1.withdraw();
        a2.deposit();
        a2.withdraw();
    }
}