package gqt375pro;
import java.util.concurrent.*;

class MultiThread24 {
    public static void main(String[] args) {

        TransferQueue<String> queue =
                new LinkedTransferQueue<>();

        new Thread(() -> {
            try {
                queue.transfer("Hello");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }).start();
    }
}