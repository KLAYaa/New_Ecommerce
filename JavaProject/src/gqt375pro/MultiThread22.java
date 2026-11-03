package gqt375pro;
import java.util.concurrent.*;

class MultiThread22 {
    public static void main(String[] args) {

        Exchanger<String> ex = new Exchanger<>();

        new Thread(() -> {
            try {
                System.out.println("T1 received: "
                        + ex.exchange("Apple"));
            } catch (Exception e) {
                System.out.println(e);
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println("T2 received: "
                        + ex.exchange("Mango"));
            } catch (Exception e) {
                System.out.println(e);
            }
        }).start();
    }
}