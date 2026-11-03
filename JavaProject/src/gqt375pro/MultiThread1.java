package gqt375pro;
public class MultiThread1 extends Thread {
    public void run() {
        System.out.println(getName());
    }

    public static void main(String[] args) {
        MultiThread1 t1 = new MultiThread1();
        MultiThread1 t2 = new MultiThread1();

        t1.start();
        t2.start();
    }
}