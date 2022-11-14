package pl.annapawelec.project.designpatterns.repository;

import java.util.List;

public interface BooksRepository {
  List<Book> findAll();
  void addBook(Book book);
  void deleteBook(Book book);
  void updateBook(Book oldBook, Book newBook);
}
