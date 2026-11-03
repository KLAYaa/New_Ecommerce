package gqt375pro;
class BankData {
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

public class BankDataDemo18 {
    public static void main(String[] args) {

        BankData b = new BankData();

        b.setAccountNumber(101);
        b.setBalance(25000);

        System.out.println("Account Number: " +
                b.getAccountNumber());

        System.out.println("Balance: " +
                b.getBalance());
    }
}