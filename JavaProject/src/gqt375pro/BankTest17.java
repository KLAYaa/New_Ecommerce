package gqt375pro;
class Bank {
    private long accountNumber;
    private double balance;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
public class BankTest17 {
    public static void main(String[] args) {

        Bank b = new Bank();

        b.setAccountNumber(123456);
        b.setBalance(10000);

        b.deposit(5000);
        b.withdraw(2000);

        System.out.println("Account Number: " +
                b.getAccountNumber());

        System.out.println("Balance: " +
                b.getBalance());
    }
}