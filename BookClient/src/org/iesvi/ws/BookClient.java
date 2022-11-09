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
        bm.setTitle("GIT");
        bm.setAuthor("Someone");

        c.addBook(bm);

        bm.setId(3);
        bm.setTitle("Java");
        bm.setAuthor("Someone else");

        c.addBook(bm);

        bm.setId(4);
        bm.setTitle("SQL");
        bm.setAuthor("Some other person");

        c.addBook(bm);

        List<BookModel> books = c.getBookList();

        for (BookModel book: books) {
            System.out.println(book);
        }
    }
}
