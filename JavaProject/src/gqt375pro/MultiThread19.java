package gqt375pro;
import java.util.concurrent.*;

class MultiThread19 {
    public static void main(String[] args) {

        Phaser phaser = new Phaser(2);

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " finished");
            phaser.arriveAndAwaitAdvance();
        };

        new Thread(task, "Thread-1").start();
        new Thread(task, "Thread-2").start();
    }
}