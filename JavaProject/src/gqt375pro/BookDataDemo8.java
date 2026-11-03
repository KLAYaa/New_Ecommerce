package gqt375pro;
class BookData {
    private String title;
    private String author;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class BookDataDemo8 {
    public static void main(String[] args) {

        BookData b = new BookData();

        b.setTitle("Java Programming");
        b.setAuthor("James Gosling");
        b.setPrice(500);

        System.out.println("Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Price: " + b.getPrice());
    }
}
