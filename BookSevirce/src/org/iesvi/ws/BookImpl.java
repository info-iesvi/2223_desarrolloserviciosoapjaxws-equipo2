package org.iesvi.ws;

import javafx.scene.image.Image;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "org.iesvi.ws.Book")
public class BookImpl implements Book {

    private int idBook;
    private Image frontPage;
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

    public BookImpl(Image frontPage, String title, String author, String editorial, int stock, String condition, double prize) {
        this.idBook = 0; // TODO: Hacer que se autogenere
        this.frontPage = frontPage;
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.stock = stock;
        this.condition = condition;
        this.prize = prize;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public Image getFrontPage() {
        return frontPage;
    }

    public void setFrontPage(Image frontPage) {
        this.frontPage = frontPage;
    }

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
        return "\nID: " + this.idBook + " | \tTITLE: " + this.title +
                "\n\tAUTHOR: " + this.author +
                "\n\tEDITORIAL: " + this.editorial + '\'' +
                "\n\tSTOCK: " + this.stock +
                "\n\tCONDITION: " + this.condition + '\'' +
                "\n\tPRIZE: " + this.prize;
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
    public List<Book> consultBookList() {
        List<Book> bookList = new ArrayList<>();

        // TODO: Decidir qué base de datos utilizar para el repositorio de libros
        // TODO: Hacer bucle para mostrar todos los libros

        return null;
    }

    @Override
    public void buyBook() {
        // TODO: Hacer método de compra de libros
    }
}
