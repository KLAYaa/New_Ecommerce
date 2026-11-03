package gqt375pro;
public class MultiThread13 {
    static ThreadLocal<Integer> number = new ThreadLocal<>();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            number.set(100);
            System.out.println("T1 = " + number.get());
        });

        Thread t2 = new Thread(() -> {
            number.set(200);
            System.out.println("T2 = " + number.get());
        });

        t1.start();
        t2.start();
    }
}