package gqt375pro;
import java.util.concurrent.*;

class MultiThread20 {
    public static void main(String[] args) {

        CyclicBarrier barrier = new CyclicBarrier(2,
                () -> System.out.println("Both threads reached barrier"));

        Runnable task = () -> {
            try {
                barrier.await();
            } catch (Exception e) {
                System.out.println(e);
            }
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}