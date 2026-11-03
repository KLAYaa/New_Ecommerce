package gqt375pro;
interface EncryptTask26 {
    void encrypt();
}

interface DecryptTask26 {
    void decrypt();
}

class Encoder26 implements EncryptTask26 {
    public void encrypt() {
        System.out.println("Text encrypted");
    }
}

class Decoder26 implements DecryptTask26 {
    public void decrypt() {
        System.out.println("Text decrypted");
    }
}

public class Interface26 {
    public static void main(String[] args) {
        Encoder26 e = new Encoder26();
        Decoder26 d = new Decoder26();

        e.encrypt();
        d.decrypt();
    }
}