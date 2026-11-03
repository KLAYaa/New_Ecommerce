package gqt375pro;
class Counter2 {
    int count = 0;

    void increment() {
        synchronized (this) {
            count++;
        }
    }
}

public class MultiThread2 {
    public static void main(String[] args) throws Exception {

        Counter2 c = new Counter2();

        Thread t1 = new Thread(() -> c.increment());
        Thread t2 = new Thread(() -> c.increment());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count = " + c.count);
    }
}