package gqt375pro;
class Account {
    private int accountNumber;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class AccountDemo4  {
    public static void main(String[] args) {

        Account a = new Account();

        a.setAccountNumber(1001);
        a.setBalance(50000);

        System.out.println("Account Number: " +
                a.getAccountNumber());

        System.out.println("Balance: " +
                a.getBalance());
    }
}
