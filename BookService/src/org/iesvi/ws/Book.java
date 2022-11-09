package org.iesvi.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * WebService is a technology that uses a set of protocols and standards used to exchange data between applications.
 *
 * Book is the interface implemented by BookImpl where the methods that the class will use are defined.
 */
@WebService
public interface Book {

    /**
     * WebMethod is an enterprise-wide business process integration suite built on java.
     *
     * This method list a list of books.
     *
     * @return a list of books
     */
    @WebMethod
    public List<BookModel> getBookList();

    /**
     * WebMethod is an enterprise-wide business process integration suite built on java.
     *
     * This method add a book into the list of books entered as a parameter.
     *
     * @param bookList book list where we add the new book
     * @param newBook the new book that we add to the list
     */
    @WebMethod
    public void addBook(List<BookModel> bookList, BookModel newBook);

    /**
     * WebMethod is an enterprise-wide business process integration suite built on java.
     *
     * This method removes a book from the book list based on its position.
     *
     * @param bookList book list where we add the new book
     * @param position the position where the book is
     */
    @WebMethod
    public void deleteBookByPosition(List<BookModel> bookList, int position);

    /**
     * WebMethod is an enterprise-wide business process integration suite built on java.
     *
     * This method removes a book from the book list based on its identification number.
     *
     * @param bookList book list where we add the new book
     * @param id the book identification number
     */
    @WebMethod
    public void deleteBookById(List<BookModel> bookList, int id);
}
