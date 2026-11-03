package gqt375pro;
class Message12 {
    synchronized void receive() {
        try {
            wait();
            System.out.println("Message received");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    synchronized void send() {
        System.out.println("Message sent");
        notify();
    }
}
public class MultiThread12 {
    public static void main(String[] args) {
        Message12 m = new Message12();
        new Thread(() -> m.receive()).start();
        new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            m.send();
        }).start();
    }
}