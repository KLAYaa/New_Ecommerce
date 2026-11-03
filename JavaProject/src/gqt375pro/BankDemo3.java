package gqt375pro;
import java.util.Scanner;

class BankAccount {
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
            System.out.println("Insufficient balance.");
        }
    }
}

public class BankDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Enter account number: ");
        account.setAccountNumber(sc.nextLong());

        System.out.print("Enter initial balance: ");
        account.setBalance(sc.nextDouble());

        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Account Number: " +
                account.getAccountNumber());

        System.out.println("Final Balance: " +
                account.getBalance());
    }
}

