package gqt375pro;
import java.util.concurrent.*;

class MultiThread25 {
    public static void main(String[] args) {

        ScheduledExecutorService ex =
                Executors.newScheduledThreadPool(1);

        ex.schedule(
                () -> System.out.println("Task executed"),
                2,
                TimeUnit.SECONDS
        );

        ex.shutdown();
    }
}