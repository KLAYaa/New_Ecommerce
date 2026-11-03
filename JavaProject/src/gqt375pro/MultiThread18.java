package gqt375pro;
import java.util.concurrent.*;

class MultiThread18 {
    public static void main(String[] args) throws Exception {

        BlockingQueue<String> queue =
                new ArrayBlockingQueue<>(2);

        queue.put("Java");
        queue.put("Python");

        System.out.println(queue.take());
        System.out.println(queue.take());
    }
}