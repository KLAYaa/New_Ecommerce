package gqt375pro;
import java.util.concurrent.*;

class MultiThread23 {
    public static void main(String[] args) throws Exception {

        ExecutorService ex = Executors.newFixedThreadPool(2);

        CompletionService<String> cs =
                new ExecutorCompletionService<>(ex);

        cs.submit(() -> "Task 1 completed");
        cs.submit(() -> "Task 2 completed");

        System.out.println(cs.take().get());
        System.out.println(cs.take().get());

        ex.shutdown();
    }
}