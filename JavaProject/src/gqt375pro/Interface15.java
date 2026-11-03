package gqt375pro;
interface Encryptable15 {
    void encrypt();
}
interface Decryptable15 {
    void decrypt();
}
class Encoder15 implements Encryptable15 {
    public void encrypt() {
        System.out.println("Data encrypted");
    }
}
class Decoder15 implements Decryptable15 {
    public void decrypt() {
        System.out.println("Data decrypted");
    }
}
public class Interface15 {
    public static void main(String[] args) {
        new Encoder15().encrypt();
        new Decoder15().decrypt();
    }
}