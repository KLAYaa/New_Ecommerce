package gqt375pro;
interface Sortable11 {
    void sort();
}

interface Searchable11 {
    void search();
}

class ListData11 implements Sortable11 {
    public void sort() {
        System.out.println("List sorted");
    }
}

class Dictionary11 implements Searchable11 {
    public void search() {
        System.out.println("Dictionary searched");
    }
}

public class Interface11 {
    public static void main(String[] args) {
        new ListData11().sort();
        new Dictionary11().search();
    }
}