package gqt375pro;
public class MultiThread16 {
    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("Thread completed");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        });

        t.start();
        t.interrupt();
    }
}