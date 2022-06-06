package vn.hd.librus.services;

import vn.hd.librus.model.BookLending;

import java.util.List;

public interface IBookLendingService {
    List<BookLending> findAll();

    void add(BookLending newUser);

    void update(BookLending newUser);

    boolean existById(long id);

    BookLending findById(long id);

    boolean lendBook(String barcode, long userId);
}