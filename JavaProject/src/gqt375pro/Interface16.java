package gqt375pro;
interface EncryptTask16 {
    void encrypt();
}
interface DecryptTask16 {
    void decrypt();
}
class Encoder16 implements EncryptTask16 {
    public void encrypt() {
        System.out.println("Message encrypted");
    }
}
class Decoder16 implements DecryptTask16 {
    public void decrypt() {
        System.out.println("Message decrypted");
    }
}
public class Interface16 {
    public static void main(String[] args) {
        Encoder16 e = new Encoder16();
        Decoder16 d = new Decoder16();

        e.encrypt();
        d.decrypt();
    }
}