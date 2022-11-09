package org.iesvi.ws;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "org.iesvi.ws.Book")
public class BookImpl implements Book {
    private int id;
    private String title;
    private String author;

    public BookImpl() {}

    /**
     * The BookImpl constructor.
     *
     * @param id the book identification number
     * @param title the name of the book
     * @param author the person who wrote the book
     */
    public BookImpl(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String toString() {
        return "BOOK " + this.id + " | Title: " + this.title + " | Author: " + this.author;
    }

    /**
     * This method is used to query a list of books.
     *
     * @return List<BookModel>
     */
    @Override
    public List<BookModel> getBookList() {
        List<BookModel> bookList = new ArrayList<>();

        if (bookList.isEmpty()) {
            System.out.println("The book list is empty");
        } else {
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i));
            }
        }
        return bookList;
    }

    /**
     * This method is used to register a new book.
     *
     * @param bookList book list where we add the new book
     * @param newBook
     */
    @Override
    public void addBook(List<BookModel> bookList, BookModel newBook) {
        bookList.add(newBook);
    }

    /**
     * This method is used to unsubscribe a book according to the position it occupies within the list.
     *
     * @param bookList book list where we add the new book
     * @param position the book position into the list
     */
    @Override
    public void deleteBookByPosition(List<BookModel> bookList, int position) {
        if (bookList.isEmpty()) {
            System.out.println("The book list is empty");
        } else {
            for (int i = 0; i < bookList.size(); i++) {
                bookList.remove(position);
            }
        }
    }

    /**
     * This method is used to unregister a book given its identifier.
     *
     * @param bookList book list where we add the new book
     * @param id the book identification number
     */
    @Override
    public void deleteBookById(List<BookModel> bookList, int id) {
        if (bookList.isEmpty()) {
            System.out.println("The book list is empty");
        } else {
            for (int i = 0; i < bookList.size(); i++) {
                bookList.remove(bookList.get(id));
            }
        }
    }
}
