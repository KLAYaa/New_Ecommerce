package gqt375pro;
class BankAccount11 {
    long accountNumber;
    double balance;
}

class SavingsAccount11 extends BankAccount11 {
    double interestRate;
}

class CurrentAccount11 extends BankAccount11 {
    double overdraftLimit;
}

public class Inheritance11 {
    public static void main(String[] args) {

        SavingsAccount11 s = new SavingsAccount11();
        s.accountNumber = 12345;
        s.balance = 25000;
        s.interestRate = 6.5;

        CurrentAccount11 c = new CurrentAccount11();
        c.accountNumber = 67890;
        c.balance = 40000;
        c.overdraftLimit = 10000;

        System.out.println("Savings: " + s.accountNumber + " " +
                           s.balance + " " + s.interestRate);

        System.out.println("Current: " + c.accountNumber + " " +
                           c.balance + " " + c.overdraftLimit);
    }
}