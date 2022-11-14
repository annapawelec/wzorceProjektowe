package pl.annapawelec.project.designpatterns.repository;

import java.util.List;

public class Shelf implements BooksRepository {
    private List<Book> books;

    @Override
    public List<Book> findAll() {
        return books;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void deleteBook(Book book) {
        books.remove(book);
    }

    @Override
    public void updateBook(Book oldBook, Book newBook) {
        //
    }
}
