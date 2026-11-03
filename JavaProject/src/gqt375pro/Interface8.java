package gqt375pro;
interface List8 {
    void add();
}

interface Set8 {
    void add();
}

class MyList8 implements List8 {
    public void add() {
        System.out.println("Element added to list");
    }
}

class MySet8 implements Set8 {
    public void add() {
        System.out.println("Element added to set");
    }
}

public class Interface8 {
    public static void main(String[] args) {
        new MyList8().add();
        new MySet8().add();
    }
}