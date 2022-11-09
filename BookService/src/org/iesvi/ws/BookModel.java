package org.iesvi.ws;

public class BookModel {
    private int id;
    private String title;
    private String author;

    /**
     * Default constructor specified only because it will throw an exception when missing.
     */
    public BookModel() {}

    /**
     *
     * @param id the book identification number
     * @param title the name of the book
     * @param author the person who wrote the book
     */
    public BookModel(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    /**
     *
     * @param id the book identification number
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title the name of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    /**
     *
     * @param author  the person who wrote the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}
