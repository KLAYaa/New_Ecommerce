package gqt375pro;
interface Runnable32 {
    void run();
}
interface Callable32 {
    void call();
}
class MyThread32 implements Runnable32 {
    public void run() {
        System.out.println("Thread started");
    }
}
class MyTask32 implements Callable32 {
    public void call() {
        System.out.println("Task executed");
    }
}
public class Interface32 {
    public static void main(String[] args) {

        MyThread32 t = new MyThread32();
        MyTask32 c = new MyTask32();
        t.run();
        c.call();
    }
}