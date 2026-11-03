package gqt375pro;
public class MultiThread7 extends Thread {
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Thread completed");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {

        MultiThread7 t1 = new MultiThread7();
        MultiThread7 t2 = new MultiThread7();

        t1.start();
        t2.start();

        t1.interrupt();
        t2.interrupt();
    }
}