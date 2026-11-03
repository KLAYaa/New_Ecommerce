package gqt375pro;
abstract class Bank13 {
    abstract void openAccount();
    abstract void closeAccount();
}

class SavingsBank13 extends Bank13 {
    void openAccount() { System.out.println("Savings account opened"); }
    void closeAccount() { System.out.println("Savings account closed"); }
}

class CurrentBank13 extends Bank13 {
    void openAccount() { System.out.println("Current account opened"); }
    void closeAccount() { System.out.println("Current account closed"); }
}

public class Abstract13 {
    public static void main(String[] args) {
        Bank13 b1 = new SavingsBank13();
        Bank13 b2 = new CurrentBank13();

        b1.openAccount();
        b1.closeAccount();
        b2.openAccount();
        b2.closeAccount();
    }
}