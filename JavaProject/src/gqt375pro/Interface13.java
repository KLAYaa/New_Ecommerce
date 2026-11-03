package gqt375pro;
interface Serializable13 {
    void serialize();
}
interface Deserializable13 {
    void deserialize();
}
class FileData13 implements Serializable13 {
    public void serialize() {
        System.out.println("File serialized");
    }
}
class Database13 implements Deserializable13 {
    public void deserialize() {
        System.out.println("Database deserialized");
    }
}
public class Interface13 {
    public static void main(String[] args) {
        new FileData13().serialize();
        new Database13().deserialize();
    }
}