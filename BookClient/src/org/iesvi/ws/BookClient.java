package org.iesvi.ws;

import java.util.List;

public class BookClient {
    public static void main(String[] args) {
        BookImplService s = new BookImplService();
        Book c = s.getBookImplPort();
        BookModel bm = new BookModel();

        bm.setId(1);
        bm.setTitle("PSP");
        bm.setAuthor("John");

        c.addBook(bm);

        bm.setId(2);
        bm.setTitle("Patata voladora");
        bm.setAuthor("Jacobo Tehacebobo");

        c.addBook(bm);

        List<BookModel> books = c.getBookList();

        System.out.println(books);
    }
}
