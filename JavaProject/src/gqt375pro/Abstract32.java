package gqt375pro;
abstract class AccountService32 {
    abstract void transaction();
}

class Deposit32 extends AccountService32 {
    void transaction() {
        System.out.println("Deposit transaction");
    }
}

class Withdrawal32 extends AccountService32 {
    void transaction() {
        System.out.println("Withdrawal transaction");
    }
}

public class Abstract32 {
    public static void main(String[] args) {
        AccountService32 a1 = new Deposit32();
        AccountService32 a2 = new Withdrawal32();

        a1.transaction();
        a2.transaction();
    }
}