package gqt375pro;
interface Save14 {
    void serialize();
}
interface Load14 {
    void deserialize();
}
class TextFile14 implements Save14 {
    public void serialize() {
        System.out.println("Text file saved");
    }
}
class DataStore14 implements Load14 {
    public void deserialize() {
        System.out.println("Data loaded");
    }
}
public class Interface14 {
    public static void main(String[] args) {
        new TextFile14().serialize();
        new DataStore14().deserialize();
    }
}