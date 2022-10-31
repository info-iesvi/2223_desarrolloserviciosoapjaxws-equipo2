package org.iesvi.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Book {
    @WebMethod
    public void getBookByTitle(String title);

    @WebMethod
    public void getBookByAuthor(String author);

    @WebMethod
    public void getBookByEditorial(String editorial);

    @WebMethod
    public void getBookList();

    @WebMethod
    public void addBook(BookModel newBook);

    @WebMethod
    public void deleteBook(BookModel deletedBook);

    @WebMethod
    public void updateBook(BookModel updatedBook);
}
