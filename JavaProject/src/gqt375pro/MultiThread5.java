package gqt375pro;
public class MultiThread5 extends Thread {
    public void run() {
        System.out.println(getName() + " completed");
    }

    public static void main(String[] args) throws Exception {

        MultiThread5 t1 = new MultiThread5();
        MultiThread5 t2 = new MultiThread5();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("All threads completed");
    }
}
