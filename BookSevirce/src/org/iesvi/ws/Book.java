package org.iesvi.ws;

import javafx.scene.image.Image;

import javax.jws.WebMethod;
import javax.jws.WebService;
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
    public List<Book> consultBookList();

    @WebMethod
    public void buyBook();
}
