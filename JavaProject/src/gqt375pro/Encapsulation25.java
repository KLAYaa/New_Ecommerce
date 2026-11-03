package gqt375pro;
import java.util.Scanner;

class SavingsAccount {
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
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class Encapsulation25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount account = new SavingsAccount();

        System.out.print("Enter account number: ");
        account.setAccountNumber(sc.nextLong());

        System.out.print("Enter opening balance: ");
        account.setBalance(sc.nextDouble());

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Final Balance: " + account.getBalance());
    }
}