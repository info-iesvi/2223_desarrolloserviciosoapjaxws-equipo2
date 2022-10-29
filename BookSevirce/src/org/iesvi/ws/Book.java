package org.iesvi.ws;

import javafx.scene.image.Image;
import org.xml.sax.SAXException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.parsers.ParserConfigurationException;
import java.util.List;

@WebService
public interface Book {

    /**
     * Books attributes
     */
    int idBook = 0;
    Image frontPage = null;
    String title = "";
    String author = "";
    String editorial = "";
    int stock = 0;
    String condition = "";
    double prize = 0;

    @WebMethod
    public void consultBookByTitle(String title);

    @WebMethod
    public void consultBookByAuthor(String author);

    @WebMethod
    public void consultBookByEditorial(String editorial);

    @WebMethod
    public void consultBookList();

//    @WebMethod
//    public void buyBook(String option);
    @WebMethod
    public void addBook(BookImpl newBook) throws ParserConfigurationException, SAXException;

    @WebMethod
    public void deleteBook(BookImpl deletedBook);

    @WebMethod
    public void updateBook(BookImpl updatedBook);
}
