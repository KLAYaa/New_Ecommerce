package gqt375pro;
import java.util.concurrent.*;

public class MultiThread17 {
    public static void main(String[] args) throws Exception {

        ExecutorService ex = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> 10 + 20;

        Future<Integer> result = ex.submit(task);

        System.out.println("Result = " + result.get());

        ex.shutdown();
    }
}