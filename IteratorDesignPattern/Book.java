package IteratorDesignPattern;

public class Book {
    private int price;
    private String bookName;

    Book(int price, String bookName) {
        this.price = price;
        this.bookName = bookName;
    }
    public String getBookName() {
        return bookName;
    }
    public int getPrice() {
        return price;
    }
}
