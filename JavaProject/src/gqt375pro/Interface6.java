package gqt375pro;
interface Compare6 {
    void compare();
}

interface CloneData6 {
    void cloneData();
}

class NumberData6 implements Compare6 {
    public void compare() {
        System.out.println("Number comparison");
    }
}

class PersonData6 implements CloneData6 {
    public void cloneData() {
        System.out.println("Person cloned");
    }
}

public class Interface6 {
    public static void main(String[] args) {
        NumberData6 n = new NumberData6();
        PersonData6 p = new PersonData6();

        n.compare();
        p.cloneData();
    }
}