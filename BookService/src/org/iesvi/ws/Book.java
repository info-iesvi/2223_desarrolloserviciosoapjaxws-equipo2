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
    public void addBook(BookImpl newBook);

    @WebMethod
    public void deleteBook(BookImpl deletedBook);

    @WebMethod
    public void updateBook(BookImpl updatedBook);
}
