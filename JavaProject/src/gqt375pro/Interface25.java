package gqt375pro;
interface Encryptable25 {
    void encrypt();
}
interface Decryptable25 {
    void decrypt();
}
class EncryptionAlgorithm25 implements Encryptable25 {
    public void encrypt() {
        System.out.println("Encryption completed");
    }
}
class DecryptionAlgorithm25 implements Decryptable25 {
    public void decrypt() {
        System.out.println("Decryption completed");
    }
}
public class Interface25 {
    public static void main(String[] args) {
        new EncryptionAlgorithm25().encrypt();
        new DecryptionAlgorithm25().decrypt();
    }
}