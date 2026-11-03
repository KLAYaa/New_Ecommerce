package gqt375pro;
interface Sendable23 {
    void send();
}
interface Receivable23 {
    void receive();
}
class Transmitter23 implements Sendable23 {
    public void send() {
        System.out.println("Signal sent");
    }
}
class Receiver23 implements Receivable23 {
    public void receive() {
        System.out.println("Signal received");
    }
}
public class Interface23 {
    public static void main(String[] args) {
        new Transmitter23().send();
        new Receiver23().receive();
    }
}