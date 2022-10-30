package org.iesvi.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Book {
    @WebMethod
    public void consultBookByTitle(String title);

    @WebMethod
    public void consultBookByAuthor(String author);

    @WebMethod
    public void consultBookByEditorial(String editorial);

    @WebMethod
    public void consultBookList();

    @WebMethod
    public void addBook(BookImpl newBook);

    @WebMethod
    public void deleteBook(BookImpl deletedBook);

    @WebMethod
    public void updateBook(BookImpl updatedBook);
}
