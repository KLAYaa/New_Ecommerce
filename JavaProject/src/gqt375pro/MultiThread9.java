package gqt375pro;
import java.util.concurrent.*;
public class MultiThread9 {
    public static void main(String[] args) throws Exception {
        CountDownLatch latch = new CountDownLatch(2);
        Runnable task = () -> {
            System.out.println("Task completed");
            latch.countDown();
        };

        new Thread(task).start();
        new Thread(task).start();

        latch.await();

        System.out.println("All tasks completed");
    }
}