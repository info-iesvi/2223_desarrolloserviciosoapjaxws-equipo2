package org.iesvi.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Book is the interface implemented by BookImpl where the methods that the class will use are defined.
 * The WebService annotation is used here to specify that whatever class implements this interface
 * will implement the code needed to create a WebService we can call.
 */
@WebService
public interface Book {
    /**
     * This method lists the books currently stored.
     * The WebMethod annotation is used here to specify that this method will be exposed
     * as a callable function of the WebService using the defined parameters with the specified result.
     *
     * @return a list defined as List<BookModel>
     */
    @WebMethod
    public List<BookModel> getBookList();

    /**
     * This method add a book into the list of books entered as a parameter.
     * The WebMethod annotation is used here to specify that this method will be exposed
     * as a callable function of the WebService using the defined parameters with the specified result.
     *
     * @param newBook the new book that we add to the list
     */
    @WebMethod
    public void addBook(BookModel newBook);

    /**
     * This method removes a book from the book list based on its position.
     * The WebMethod annotation is used here to specify that this method will be exposed
     * as a callable function of the WebService using the defined parameters with the specified result.
     *
     * @param position the position where the book is
     */
    @WebMethod
    public void deleteBookByPosition(int position);

    /**
     * This method removes a book from the book list based on its identification number.
     * The WebMethod annotation is used here to specify that this method will be exposed
     * as a callable function of the WebService using the defined parameters with the specified result.
     *
     * @param id the book identification number
     */
    @WebMethod
    public void deleteBookById(int id);
}
