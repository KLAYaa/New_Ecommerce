package gqt375pro;
public class MultiThread3 extends Thread {
    public void run() {
        System.out.println(getName() + " : Priority " + getPriority());
    }

    public static void main(String[] args) {

        MultiThread3 t1 = new MultiThread3();
        MultiThread3 t2 = new MultiThread3();

        t1.setPriority(3);
        t2.setPriority(8);

        t1.start();
        t2.start();
    }
}