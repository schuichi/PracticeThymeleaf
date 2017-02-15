package tomek.pl.model;

/**
 * Created by Tomek on 2017-02-01.
 */


public class Book {

    private String author;

    private String title;

    private int price;

    public Book(String author, String title, int price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return author + " " + title + " " + price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
