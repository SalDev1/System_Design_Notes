package IteratorDesignPattern;

import java.util.List;

public class BookIterator implements Iterator {
    private List<Book>books;
    private int index = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();      
    }

    @Override
    public Object next() {
        // Do the traversal of the all the elements in the given list
        if(this.hasNext()) {
            return books.get(index++);
        }
        return null;
    }
}
