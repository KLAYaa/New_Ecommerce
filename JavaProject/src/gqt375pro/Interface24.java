package gqt375pro;
interface Send24 {
    void send();
}

interface Receive24 {
    void receive();
}

class RadioTransmitter24 implements Send24 {
    public void send() {
        System.out.println("Radio signal sent");
    }
}

class RadioReceiver24 implements Receive24 {
    public void receive() {
        System.out.println("Radio signal received");
    }
}

public class Interface24 {
    public static void main(String[] args) {
        new RadioTransmitter24().send();
        new RadioReceiver24().receive();
    }
}