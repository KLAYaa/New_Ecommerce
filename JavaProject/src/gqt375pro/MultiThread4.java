package gqt375pro;
import java.util.concurrent.*;
public class MultiThread4 {
    public static void main(String[] args) {

        ExecutorService ex = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 4; i++) {
            int task = i;
            ex.execute(() ->
                System.out.println("Task " + task)
            );
        }

        ex.shutdown();
    }
}