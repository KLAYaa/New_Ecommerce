package gqt375pro;
import java.util.concurrent.*;

public class MultiThread15 {
    public static void main(String[] args) {

        ExecutorService ex = Executors.newFixedThreadPool(2);

        ex.execute(() -> System.out.println("Task 1 executed"));
        ex.execute(() -> System.out.println("Task 2 executed"));
        ex.execute(() -> System.out.println("Task 3 executed"));

        ex.shutdown();
    }
}