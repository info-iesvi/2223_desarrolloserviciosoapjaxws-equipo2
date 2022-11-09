package org.iesvi.ws;

/**
 * This class represents the data model used for storing data about a single book.
 */
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

    /**
     * Method to get the ID number of the current book.
     *
     * @return the ID number of the book
     */
    public int getId() {
        return id;
    }

    /**
     * Method to set the ID number of the current book.
     *
     * @param id the new ID number of the book
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method to get the title of the current book.
     *
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Method to set the title of the current book.
     *
     * @param title the new title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Method to get the author of the current book.
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Method to set the author of the current book.
     *
     * @param author the new author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Overrides the default toString implementation to show Book elements in the following format:
     * "Book X | title: A | author: B"
     *
     * @return the String that represents the current book
     */
    @Override
    public String toString() {
        return "Book " + id +
                " | title: " + title +
                " | author: " + author;
    }
}
