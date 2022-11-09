package org.iesvi.ws;

public class BookClient {
    public static void main(String[] args) {
        BookImplService s = new BookImplService();
        Book c = s.getBookImplPort();
        BookModel bm = new BookModel();

        bm.setId(1);
        bm.setTitle("PSP");
        bm.setAuthor("John");

        c.addBook(bm);

        c.getBookList();
    }
}
