package gqt375pro;
abstract class Portal14 {
    abstract void login();
}

class StudentPortal14 extends Portal14 {
    void login() {
        System.out.println("Student logged in");
    }
}

class AdminPortal14 extends Portal14 {
    void login() {
        System.out.println("Admin logged in");
    }
}

public class Abstract14 {
    public static void main(String[] args) {
        Portal14 p1 = new StudentPortal14();
        Portal14 p2 = new AdminPortal14();

        p1.login();
        p2.login();
    }
}