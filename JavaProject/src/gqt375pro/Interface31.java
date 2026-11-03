package gqt375pro;
interface Runnable31 {
    void run();
}

interface Callable31 {
    void call();
}

class ThreadTask31 implements Runnable31 {
    public void run() {
        System.out.println("Thread is running");
    }
}

class WorkTask31 implements Callable31 {
    public void call() {
        System.out.println("Task is called");
    }
}

public class Interface31 {
    public static void main(String[] args) {

        ThreadTask31 t = new ThreadTask31();
        WorkTask31 w = new WorkTask31();

        t.run();
        w.call();
    }
}