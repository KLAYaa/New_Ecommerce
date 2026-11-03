package gqt375pro;
interface Comparable5 {
    void compareTo();
}

interface Cloneable5 {
    void cloneData();
}

class Number5 implements Comparable5 {
    public void compareTo() {
        System.out.println("Numbers are compared");
    }
}

class Person5 implements Cloneable5 {
    public void cloneData() {
        System.out.println("Person data is cloned");
    }
}

public class Interface5 {
    public static void main(String[] args) {
        new Number5().compareTo();
        new Person5().cloneData();
    }
}