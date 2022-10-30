package org.iesvi.ws;

import javafx.scene.image.Image;
import org.xml.sax.SAXException;

import javax.jws.WebService;
import javax.xml.bind.Element;
import javax.xml.parsers.ParserConfigurationException;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "org.iesvi.ws.Book")
public class BookImpl implements Book{

    private int idBook;
    //private Image frontPage;
    private String title;
    private String author;
    private String editorial;
    private int stock;
    private String condition;
    private double prize;

    /**
     * Default constructor
     */
    public BookImpl() {}

    public BookImpl(String title, String author, String editorial, int stock, String condition, double prize) {

        this.idBook = 0;
//        this.frontPage = frontPage;
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.stock = stock;
        this.condition = condition;
        this.prize = prize;
    }

    public BookImpl(String xmlName) throws Exception {
        BookConnection conn = new BookConnection();
        conn.readXml(xmlName);
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

//    public Image getFrontPage() {
//        return frontPage;
//    }
//
//    public void setFrontPage(Image frontPage) {
//        this.frontPage = frontPage;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        try {
            BookImpl book = new BookImpl("examplesBooks");
            this.idBook = book.idBook;
            this.stock = book.stock;
            this.author = book.author;
            this.title = book.title;
            this.editorial = book.editorial;
            this.prize = book.prize;
            this.condition = book.condition;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return "\nID: " + this.idBook + " | \tTITLE: " + this.title +
                "\n\tAUTHOR: " + this.author +
                "\n\tEDITORIAL: " + this.editorial + '\'' +
                "\n\tSTOCK: " + this.stock +
                "\n\tCONDITION: " + this.condition + '\'' +
                "\n\tPRIZE: £" + this.prize;
    }

    @Override
    public void consultBookByTitle(String title) {
        if (title.equalsIgnoreCase(this.getTitle())) {
            System.out.println(this);
        } else {
            System.out.println("Title not found");
        }
    }

    @Override
    public void consultBookByAuthor(String author) {
        if (author.equalsIgnoreCase(this.author)) {
            System.out.println(this);
        } else {
            System.out.println("Author not found");
        }
    }

    @Override
    public void consultBookByEditorial(String editorial) {
        if (editorial.equalsIgnoreCase(this.editorial)) {
            System.out.println(this);
        } else {
            System.out.println("Editorial not found");
        }
    }

    @Override
    public void consultBookList() {
        List<Book> bookList = new ArrayList<>();
        for(Book book:bookList){
            System.out.println(book.toString());
        }
    }

    @Override
    public void addBook(BookImpl newBook) throws Exception {
        newBook = new BookImpl("repository/examplesBooks.xml");

    }

    @Override
    public void deleteBook(BookImpl deletedBook) {

    }

    @Override
    public void updateBook(BookImpl updatedBook) {

    }

//    @Override
//    public void buyBook(String option) {
//        if(option.compareToIgnoreCase(getAuthor())==0){
//            if(getStock()>0){
//                consultBookByAuthor(option);
//            }
//        } else if (option.compareToIgnoreCase(getEditorial())==0) {
//            if(getStock()>0){
//                consultBookByAuthor(option);
//            }
//        } else if (option.compareToIgnoreCase(getTitle())==0) {
//            if(getStock()>0){
//                consultBookByAuthor(option);
//            }
//        }else {
//            System.out.println("Book not found");
//        }
//        //We use a xml file to search the data
//    }


}
