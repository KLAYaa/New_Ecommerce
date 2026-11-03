package gqt375pro;
import java.util.concurrent.locks.*;
public class MultiThread26 {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            lock.lock();
            try {
                condition.await();
                System.out.println("Thread resumed");
            } catch (InterruptedException e) {
                System.out.println(e);
            } finally {
                lock.unlock();
            }
        });
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        lock.lock();
        try {
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}