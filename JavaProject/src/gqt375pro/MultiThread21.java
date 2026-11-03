package gqt375pro;
import java.util.concurrent.*;

class MultiThread21 {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(1);

        Thread t = new Thread(() -> {
            try {
                semaphore.acquire();

                System.out.println("Resource accessed");

                semaphore.release();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        t.start();
    }
}