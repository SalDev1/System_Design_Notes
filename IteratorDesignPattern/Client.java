package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book(100, "Science"));
        bookList.add(new Book(200, "Maths"));
        bookList.add(new Book(300, "GK"));
        bookList.add(new Book(400, "Drawing"));

        Library lib = new Library(bookList);
        Iterator iterator = lib.createIterator();

        while(iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
        }
    }
}
