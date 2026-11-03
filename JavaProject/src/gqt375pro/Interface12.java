package gqt375pro;
interface Sortable12 {
    void sort();
}
interface Searchable12 {
    void search();
}
class StudentList12 implements Sortable12 {
    public void sort() {
        System.out.println("Student list sorted");
    }
}
class WordDictionary12 implements Searchable12 {
    public void search() {
        System.out.println("Word found");
    }
}
public class Interface12 {
    public static void main(String[] args) {
        StudentList12 l = new StudentList12();
        WordDictionary12 d = new WordDictionary12();

        l.sort();
        d.search();
    }
}