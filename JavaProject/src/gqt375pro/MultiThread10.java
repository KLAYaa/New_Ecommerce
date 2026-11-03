package gqt375pro;
public class MultiThread10 extends Thread {
    public void run() {
        System.out.println(getName() + " : " + getPriority());
    }

    public static void main(String[] args) {

        MultiThread10 t1 = new MultiThread10();
        MultiThread10 t2 = new MultiThread10();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}