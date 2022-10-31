package org.iesvi.ws;

public class BookModel {
    private static int idBook;
    private static String title;
    private static String author;
    private static String editorial;
    private static int stock;
    private static String condition;
    private static double prize;

    /**
     * This is the constructor
     *
     * @param title
     * @param author
     * @param editorial
     * @param stock
     * @param condition
     * @param prize
     */
    public BookModel (String title, String author, String editorial, int stock, String condition, double prize) {
        this.idBook = 0;
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.stock = stock;
        this.condition = condition;
        this.prize = prize;
    }

    public static int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public static String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public static int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public static String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public static double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }
}
