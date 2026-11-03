package gqt375pro;
abstract class Bank25 {
    abstract void openAccount();
    abstract void closeAccount();
}

class SavingsBank25 extends Bank25 {
    void openAccount() {
        System.out.println("Savings account opened");
    }

    void closeAccount() {
        System.out.println("Savings account closed");
    }
}

class CurrentBank25 extends Bank25 {
    void openAccount() {
        System.out.println("Current account opened");
    }

    void closeAccount() {
        System.out.println("Current account closed");
    }
}

public class Abstract25 {
    public static void main(String[] args) {
        Bank25 b1 = new SavingsBank25();
        Bank25 b2 = new CurrentBank25();

        b1.openAccount();
        b1.closeAccount();
        b2.openAccount();
        b2.closeAccount();
    }
}