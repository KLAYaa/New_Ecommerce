package gqt375pro;
public class MultiThread14 {
    static volatile boolean running = true;

    public static void main(String[] args) throws Exception {

        Thread t = new Thread(() -> {
            while (running) {
            }
            System.out.println("Thread stopped");
        });

        t.start();

        Thread.sleep(1000);
        running = false;
    }
}