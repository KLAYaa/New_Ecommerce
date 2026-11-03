package gqt375pro;
abstract class Account31 {
    abstract void deposit();
    abstract void withdraw();
}

class SavingsAccount31 extends Account31 {
    void deposit() {
        System.out.println("Deposit in Savings Account");
    }

    void withdraw() {
        System.out.println("Withdraw from Savings Account");
    }
}

class CurrentAccount31 extends Account31 {
    void deposit() {
        System.out.println("Deposit in Current Account");
    }

    void withdraw() {
        System.out.println("Withdraw from Current Account");
    }
}

public class Abstract31 {
    public static void main(String[] args) {
        Account31 a1 = new SavingsAccount31();
        Account31 a2 = new CurrentAccount31();

        a1.deposit();
        a1.withdraw();
        a2.deposit();
        a2.withdraw();
    }
}