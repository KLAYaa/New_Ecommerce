package gqt375pro;
public class MultiThread11 extends Thread {

    MultiThread11(ThreadGroup group, String name) {
        super(group, name);
    }

    public void run() {
        System.out.println(getName());
    }

    public static void main(String[] args) {

        ThreadGroup group = new ThreadGroup("Workers");

        new MultiThread11(group, "Thread-1").start();
        new MultiThread11(group, "Thread-2").start();
    }
}