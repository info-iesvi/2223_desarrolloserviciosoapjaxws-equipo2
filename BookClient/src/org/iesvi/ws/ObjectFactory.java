
package org.iesvi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.iesvi.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddBookResponse_QNAME = new QName("http://ws.iesvi.org/", "addBookResponse");
    private final static QName _DeleteBookByPositionResponse_QNAME = new QName("http://ws.iesvi.org/", "deleteBookByPositionResponse");
    private final static QName _DeleteBookByIdResponse_QNAME = new QName("http://ws.iesvi.org/", "deleteBookByIdResponse");
    private final static QName _GetBookListResponse_QNAME = new QName("http://ws.iesvi.org/", "getBookListResponse");
    private final static QName _DeleteBookById_QNAME = new QName("http://ws.iesvi.org/", "deleteBookById");
    private final static QName _GetBookList_QNAME = new QName("http://ws.iesvi.org/", "getBookList");
    private final static QName _DeleteBookByPosition_QNAME = new QName("http://ws.iesvi.org/", "deleteBookByPosition");
    private final static QName _AddBook_QNAME = new QName("http://ws.iesvi.org/", "addBook");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.iesvi.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteBookById }
     * 
     */
    public DeleteBookById createDeleteBookById() {
        return new DeleteBookById();
    }

    /**
     * Create an instance of {@link GetBookListResponse }
     * 
     */
    public GetBookListResponse createGetBookListResponse() {
        return new GetBookListResponse();
    }

    /**
     * Create an instance of {@link DeleteBookByIdResponse }
     * 
     */
    public DeleteBookByIdResponse createDeleteBookByIdResponse() {
        return new DeleteBookByIdResponse();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link DeleteBookByPositionResponse }
     * 
     */
    public DeleteBookByPositionResponse createDeleteBookByPositionResponse() {
        return new DeleteBookByPositionResponse();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link DeleteBookByPosition }
     * 
     */
    public DeleteBookByPosition createDeleteBookByPosition() {
        return new DeleteBookByPosition();
    }

    /**
     * Create an instance of {@link GetBookList }
     * 
     */
    public GetBookList createGetBookList() {
        return new GetBookList();
    }

    /**
     * Create an instance of {@link BookModel }
     * 
     */
    public BookModel createBookModel() {
        return new BookModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "addBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookByPositionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "deleteBookByPositionResponse")
    public JAXBElement<DeleteBookByPositionResponse> createDeleteBookByPositionResponse(DeleteBookByPositionResponse value) {
        return new JAXBElement<DeleteBookByPositionResponse>(_DeleteBookByPositionResponse_QNAME, DeleteBookByPositionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "deleteBookByIdResponse")
    public JAXBElement<DeleteBookByIdResponse> createDeleteBookByIdResponse(DeleteBookByIdResponse value) {
        return new JAXBElement<DeleteBookByIdResponse>(_DeleteBookByIdResponse_QNAME, DeleteBookByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "getBookListResponse")
    public JAXBElement<GetBookListResponse> createGetBookListResponse(GetBookListResponse value) {
        return new JAXBElement<GetBookListResponse>(_GetBookListResponse_QNAME, GetBookListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "deleteBookById")
    public JAXBElement<DeleteBookById> createDeleteBookById(DeleteBookById value) {
        return new JAXBElement<DeleteBookById>(_DeleteBookById_QNAME, DeleteBookById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "getBookList")
    public JAXBElement<GetBookList> createGetBookList(GetBookList value) {
        return new JAXBElement<GetBookList>(_GetBookList_QNAME, GetBookList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookByPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "deleteBookByPosition")
    public JAXBElement<DeleteBookByPosition> createDeleteBookByPosition(DeleteBookByPosition value) {
        return new JAXBElement<DeleteBookByPosition>(_DeleteBookByPosition_QNAME, DeleteBookByPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

}
