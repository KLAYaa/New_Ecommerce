package gqt375pro;
import java.nio.*;
public class Exception24 {
    public static void main(String[] args) {
        try {
            IntBuffer buffer = IntBuffer.allocate(2);
            buffer.put(100);
            buffer.flip();
            System.out.println(buffer.get());
            System.out.println(buffer.get());
        } catch (BufferUnderflowException e) {
            System.out.println("Not enough data in buffer");
        }
    }
}