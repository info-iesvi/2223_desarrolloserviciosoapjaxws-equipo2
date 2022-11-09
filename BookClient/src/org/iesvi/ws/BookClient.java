package org.iesvi.ws;

import java.util.ArrayList;
import java.util.List;

public class BookClient {
    public static void main(String[] args) {
        List<BookModel> books = new ArrayList<>();
        BookImplService s = new BookImplService();
        Book c = s.getBookImplPort();
        BookModel bm = new BookModel();

        bm.setId(1);
        bm.setTitle("PSP");
        bm.setAuthor("John");

        c.addBook(books, bm);

        c.getBookList();
    }
}
