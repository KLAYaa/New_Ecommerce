package gqt375pro;
class BankAccount12 {
    long accountNumber = 56789;
    double balance = 30000;
}

class SavingsAccount12 extends BankAccount12 {
    String type = "Savings";
}

class CurrentAccount12 extends BankAccount12 {
    String type = "Current";
}

class Inheritance12 {
    public static void main(String[] args) {

        SavingsAccount12 s = new SavingsAccount12();
        CurrentAccount12 c = new CurrentAccount12();

        System.out.println(s.accountNumber + " " + s.balance + " " + s.type);
        System.out.println(c.accountNumber + " " + c.balance + " " + c.type);
    }
}