package gqt375pro;
public class MultiThread8 {
    static ThreadLocal<String> user = new ThreadLocal<>();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            user.set("Ravi");
            System.out.println("T1: " + user.get());
        });

        Thread t2 = new Thread(() -> {
            user.set("Anu");
            System.out.println("T2: " + user.get());
        });

        t1.start();
        t2.start();
    }
}