package gqt375pro;
interface List7 {
    void add();
    void remove();
    void contains();
}
interface Set7 {
    void add();
    void remove();
    void contains();
}
class ArrayList7 implements List7 {
    public void add() { System.out.println("Added to List"); }
    public void remove() { System.out.println("Removed from List"); }
    public void contains() { System.out.println("Checking List"); }
}
class HashSet7 implements Set7 {
    public void add() { System.out.println("Added to Set"); }
    public void remove() { System.out.println("Removed from Set"); }
    public void contains() { System.out.println("Checking Set"); }
}
public class Interface7 {
    public static void main(String[] args) {
        ArrayList7 a = new ArrayList7();
        HashSet7 h = new HashSet7();

        a.add();
        a.remove();
        a.contains();

        h.add();
        h.remove();
        h.contains();
    }
}