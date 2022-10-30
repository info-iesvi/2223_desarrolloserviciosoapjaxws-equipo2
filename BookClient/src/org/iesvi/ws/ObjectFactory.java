package org.iesvi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.iesvi.ws package. 
 * <p>An org.iesvi.ws.ObjectFactory allows you to programatically
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

    private final static QName _GetBookByEditorial_QNAME = new QName("http://ws.iesvi.org/", "getBookByEditorial");
    private final static QName _GetBookList_QNAME = new QName("http://ws.iesvi.org/", "getBookList");
    private final static QName _UpdateBook_QNAME = new QName("http://ws.iesvi.org/", "updateBook");
    private final static QName _AddBookResponse_QNAME = new QName("http://ws.iesvi.org/", "addBookResponse");
    private final static QName _GetBookByAuthor_QNAME = new QName("http://ws.iesvi.org/", "getBookByAuthor");
    private final static QName _GetBookByAuthorResponse_QNAME = new QName("http://ws.iesvi.org/", "getBookByAuthorResponse");
    private final static QName _AddBook_QNAME = new QName("http://ws.iesvi.org/", "addBook");
    private final static QName _GetBookByTitleResponse_QNAME = new QName("http://ws.iesvi.org/", "getBookByTitleResponse");
    private final static QName _GetBookByEditorialResponse_QNAME = new QName("http://ws.iesvi.org/", "getBookByEditorialResponse");
    private final static QName _GetBookListResponse_QNAME = new QName("http://ws.iesvi.org/", "getBookListResponse");
    private final static QName _UpdateBookResponse_QNAME = new QName("http://ws.iesvi.org/", "updateBookResponse");
    private final static QName _DeleteBookResponse_QNAME = new QName("http://ws.iesvi.org/", "deleteBookResponse");
    private final static QName _DeleteBook_QNAME = new QName("http://ws.iesvi.org/", "deleteBook");
    private final static QName _GetBookByTitle_QNAME = new QName("http://ws.iesvi.org/", "getBookByTitle");

    /**
     * Create a new org.iesvi.ws.ObjectFactory that can be used to create new instances of schema derived classes for package: org.iesvi.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link GetBookByEditorial }
     * 
     */
    public GetBookByEditorial createGetBookByEditorial() {
        return new GetBookByEditorial();
    }

    /**
     * Create an instance of {@link GetBookList }
     * 
     */
    public GetBookList createGetBookList() {
        return new GetBookList();
    }

    /**
     * Create an instance of {@link UpdateBook }
     * 
     */
    public UpdateBook createUpdateBook() {
        return new UpdateBook();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link GetBookByTitleResponse }
     * 
     */
    public GetBookByTitleResponse createGetBookByTitleResponse() {
        return new GetBookByTitleResponse();
    }

    /**
     * Create an instance of {@link GetBookByAuthor }
     * 
     */
    public GetBookByAuthor createGetBookByAuthor() {
        return new GetBookByAuthor();
    }

    /**
     * Create an instance of {@link GetBookByAuthorResponse }
     * 
     */
    public GetBookByAuthorResponse createGetBookByAuthorResponse() {
        return new GetBookByAuthorResponse();
    }

    /**
     * Create an instance of {@link DeleteBook }
     * 
     */
    public DeleteBook createDeleteBook() {
        return new DeleteBook();
    }

    /**
     * Create an instance of {@link DeleteBookResponse }
     * 
     */
    public DeleteBookResponse createDeleteBookResponse() {
        return new DeleteBookResponse();
    }

    /**
     * Create an instance of {@link UpdateBookResponse }
     * 
     */
    public UpdateBookResponse createUpdateBookResponse() {
        return new UpdateBookResponse();
    }

    /**
     * Create an instance of {@link GetBookByEditorialResponse }
     * 
     */
    public GetBookByEditorialResponse createGetBookByEditorialResponse() {
        return new GetBookByEditorialResponse();
    }

    /**
     * Create an instance of {@link GetBookListResponse }
     * 
     */
    public GetBookListResponse createGetBookListResponse() {
        return new GetBookListResponse();
    }

    /**
     * Create an instance of {@link GetBookByTitle }
     * 
     */
    public GetBookByTitle createGetBookByTitle() {
        return new GetBookByTitle();
    }

    /**
     * Create an instance of {@link BookImpl }
     * 
     */
    public BookImpl createBookImpl() {
        return new BookImpl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByEditorial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "getBookByEditorial")
    public JAXBElement<GetBookByEditorial> createGetBookByEditorial(GetBookByEditorial value) {
        return new JAXBElement<GetBookByEditorial>(_GetBookByEditorial_QNAME, GetBookByEditorial.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "updateBook")
    public JAXBElement<UpdateBook> createUpdateBook(UpdateBook value) {
        return new JAXBElement<UpdateBook>(_UpdateBook_QNAME, UpdateBook.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "getBookByAuthor")
    public JAXBElement<GetBookByAuthor> createGetBookByAuthor(GetBookByAuthor value) {
        return new JAXBElement<GetBookByAuthor>(_GetBookByAuthor_QNAME, GetBookByAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "getBookByAuthorResponse")
    public JAXBElement<GetBookByAuthorResponse> createGetBookByAuthorResponse(GetBookByAuthorResponse value) {
        return new JAXBElement<GetBookByAuthorResponse>(_GetBookByAuthorResponse_QNAME, GetBookByAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "getBookByTitleResponse")
    public JAXBElement<GetBookByTitleResponse> createGetBookByTitleResponse(GetBookByTitleResponse value) {
        return new JAXBElement<GetBookByTitleResponse>(_GetBookByTitleResponse_QNAME, GetBookByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByEditorialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "getBookByEditorialResponse")
    public JAXBElement<GetBookByEditorialResponse> createGetBookByEditorialResponse(GetBookByEditorialResponse value) {
        return new JAXBElement<GetBookByEditorialResponse>(_GetBookByEditorialResponse_QNAME, GetBookByEditorialResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "updateBookResponse")
    public JAXBElement<UpdateBookResponse> createUpdateBookResponse(UpdateBookResponse value) {
        return new JAXBElement<UpdateBookResponse>(_UpdateBookResponse_QNAME, UpdateBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "deleteBookResponse")
    public JAXBElement<DeleteBookResponse> createDeleteBookResponse(DeleteBookResponse value) {
        return new JAXBElement<DeleteBookResponse>(_DeleteBookResponse_QNAME, DeleteBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "deleteBook")
    public JAXBElement<DeleteBook> createDeleteBook(DeleteBook value) {
        return new JAXBElement<DeleteBook>(_DeleteBook_QNAME, DeleteBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "getBookByTitle")
    public JAXBElement<GetBookByTitle> createGetBookByTitle(GetBookByTitle value) {
        return new JAXBElement<GetBookByTitle>(_GetBookByTitle_QNAME, GetBookByTitle.class, null, value);
    }

}
