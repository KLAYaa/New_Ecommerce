package gqt375pro;
class Person9 {
    String name;
    int age;
}

class Student9 extends Person9 {
    int rollNumber;
}

class Teacher9 extends Person9 {
    String subject;
}

class Inheritance9 {
    public static void main(String[] args) {

        Student9 s = new Student9();
        s.name = "Rahul";
        s.age = 20;
        s.rollNumber = 25;

        Teacher9 t = new Teacher9();
        t.name = "Priya";
        t.age = 35;
        t.subject = "Java";

        System.out.println(s.name + " " + s.age + " " + s.rollNumber);
        System.out.println(t.name + " " + t.age + " " + t.subject);
    }
}