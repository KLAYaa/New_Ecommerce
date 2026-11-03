package gqt375pro;
import java.nio.*;
class Exception23 {
    public static void main(String[] args) {
        try {
            IntBuffer buffer = IntBuffer.allocate(2);
            buffer.put(10);
            buffer.put(20);
            buffer.put(30);
        } catch (BufferOverflowException e) {
            System.out.println("Buffer is full");
        }
    }
}