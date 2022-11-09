package org.iesvi.ws;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements the WebService methods defined
 * by the Book interface and keeps the list.
 * The WebService annotation is used here to specify the interface
 * implemented by the current class.
 */
@WebService(endpointInterface = "org.iesvi.ws.Book")
public class BookImpl implements Book {
    private List<BookModel> books;

    /**
     * Default constructor that initializes the list of books.
     */
    public BookImpl() {
        books = new ArrayList<>();
    }

    /**
     * This method is used to query a list of books.
     *
     * @return a list defined as List<BookModel>
     */
    @Override
    public List<BookModel> getBookList() {
        if (this.books.isEmpty()) {
            System.out.println("The book list is empty");
        } else {
            for (int i = 0; i < this.books.size(); i++) {
                System.out.println(this.books.get(i));
            }
        }
        return this.books;
    }

    /**
     * This method is used to register a new book.
     *
     * @param newBook an instance of the BookModel to add
     */
    @Override
    public void addBook(BookModel newBook) {
        this.books.add(newBook);
    }

    /**
     * This method is used to unsubscribe a book according to the position it occupies within the list.
     *
     * @param position the book position into the list
     */
    @Override
    public void deleteBookByPosition(int position) {
        if (this.books.isEmpty()) {
            System.out.println("The book list is empty");
        } else {
            this.books.remove(position);
        }
    }

    /**
     * This method is used to unregister a book given its identifier.
     *
     * @param id the book identification number
     */
    @Override
    public void deleteBookById(int id) {
        if (this.books.isEmpty()) {
            System.out.println("The book list is empty");
        } else {
            for (int i = 0; i < this.books.size(); i++) {
                if (this.books.get(i).getId() == id) {
                    this.books.remove(i);
                }
            }
        }
    }
}
