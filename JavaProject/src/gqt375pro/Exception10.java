package gqt375pro;
class Exception10 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
            System.out.println("Thread completed");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}