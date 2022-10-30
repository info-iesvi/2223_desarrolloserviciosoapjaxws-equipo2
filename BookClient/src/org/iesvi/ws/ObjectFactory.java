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

    private final static QName _ConsultBookByEditorial_QNAME = new QName("http://ws.iesvi.org/", "consultBookByEditorial");
    private final static QName _ConsultBookList_QNAME = new QName("http://ws.iesvi.org/", "consultBookList");
    private final static QName _UpdateBook_QNAME = new QName("http://ws.iesvi.org/", "updateBook");
    private final static QName _AddBookResponse_QNAME = new QName("http://ws.iesvi.org/", "addBookResponse");
    private final static QName _ConsultBookByAuthor_QNAME = new QName("http://ws.iesvi.org/", "consultBookByAuthor");
    private final static QName _ConsultBookByAuthorResponse_QNAME = new QName("http://ws.iesvi.org/", "consultBookByAuthorResponse");
    private final static QName _AddBook_QNAME = new QName("http://ws.iesvi.org/", "addBook");
    private final static QName _ConsultBookByTitleResponse_QNAME = new QName("http://ws.iesvi.org/", "consultBookByTitleResponse");
    private final static QName _ConsultBookByEditorialResponse_QNAME = new QName("http://ws.iesvi.org/", "consultBookByEditorialResponse");
    private final static QName _ConsultBookListResponse_QNAME = new QName("http://ws.iesvi.org/", "consultBookListResponse");
    private final static QName _UpdateBookResponse_QNAME = new QName("http://ws.iesvi.org/", "updateBookResponse");
    private final static QName _DeleteBookResponse_QNAME = new QName("http://ws.iesvi.org/", "deleteBookResponse");
    private final static QName _DeleteBook_QNAME = new QName("http://ws.iesvi.org/", "deleteBook");
    private final static QName _ConsultBookByTitle_QNAME = new QName("http://ws.iesvi.org/", "consultBookByTitle");

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
     * Create an instance of {@link ConsultBookByEditorial }
     * 
     */
    public ConsultBookByEditorial createConsultBookByEditorial() {
        return new ConsultBookByEditorial();
    }

    /**
     * Create an instance of {@link ConsultBookList }
     * 
     */
    public ConsultBookList createConsultBookList() {
        return new ConsultBookList();
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
     * Create an instance of {@link ConsultBookByTitleResponse }
     * 
     */
    public ConsultBookByTitleResponse createConsultBookByTitleResponse() {
        return new ConsultBookByTitleResponse();
    }

    /**
     * Create an instance of {@link ConsultBookByAuthor }
     * 
     */
    public ConsultBookByAuthor createConsultBookByAuthor() {
        return new ConsultBookByAuthor();
    }

    /**
     * Create an instance of {@link ConsultBookByAuthorResponse }
     * 
     */
    public ConsultBookByAuthorResponse createConsultBookByAuthorResponse() {
        return new ConsultBookByAuthorResponse();
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
     * Create an instance of {@link ConsultBookByEditorialResponse }
     * 
     */
    public ConsultBookByEditorialResponse createConsultBookByEditorialResponse() {
        return new ConsultBookByEditorialResponse();
    }

    /**
     * Create an instance of {@link ConsultBookListResponse }
     * 
     */
    public ConsultBookListResponse createConsultBookListResponse() {
        return new ConsultBookListResponse();
    }

    /**
     * Create an instance of {@link ConsultBookByTitle }
     * 
     */
    public ConsultBookByTitle createConsultBookByTitle() {
        return new ConsultBookByTitle();
    }

    /**
     * Create an instance of {@link BookImpl }
     * 
     */
    public BookImpl createBookImpl() {
        return new BookImpl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultBookByEditorial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "consultBookByEditorial")
    public JAXBElement<ConsultBookByEditorial> createConsultBookByEditorial(ConsultBookByEditorial value) {
        return new JAXBElement<ConsultBookByEditorial>(_ConsultBookByEditorial_QNAME, ConsultBookByEditorial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultBookList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "consultBookList")
    public JAXBElement<ConsultBookList> createConsultBookList(ConsultBookList value) {
        return new JAXBElement<ConsultBookList>(_ConsultBookList_QNAME, ConsultBookList.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultBookByAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "consultBookByAuthor")
    public JAXBElement<ConsultBookByAuthor> createConsultBookByAuthor(ConsultBookByAuthor value) {
        return new JAXBElement<ConsultBookByAuthor>(_ConsultBookByAuthor_QNAME, ConsultBookByAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultBookByAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "consultBookByAuthorResponse")
    public JAXBElement<ConsultBookByAuthorResponse> createConsultBookByAuthorResponse(ConsultBookByAuthorResponse value) {
        return new JAXBElement<ConsultBookByAuthorResponse>(_ConsultBookByAuthorResponse_QNAME, ConsultBookByAuthorResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultBookByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "consultBookByTitleResponse")
    public JAXBElement<ConsultBookByTitleResponse> createConsultBookByTitleResponse(ConsultBookByTitleResponse value) {
        return new JAXBElement<ConsultBookByTitleResponse>(_ConsultBookByTitleResponse_QNAME, ConsultBookByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultBookByEditorialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "consultBookByEditorialResponse")
    public JAXBElement<ConsultBookByEditorialResponse> createConsultBookByEditorialResponse(ConsultBookByEditorialResponse value) {
        return new JAXBElement<ConsultBookByEditorialResponse>(_ConsultBookByEditorialResponse_QNAME, ConsultBookByEditorialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultBookListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "consultBookListResponse")
    public JAXBElement<ConsultBookListResponse> createConsultBookListResponse(ConsultBookListResponse value) {
        return new JAXBElement<ConsultBookListResponse>(_ConsultBookListResponse_QNAME, ConsultBookListResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultBookByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.iesvi.org/", name = "consultBookByTitle")
    public JAXBElement<ConsultBookByTitle> createConsultBookByTitle(ConsultBookByTitle value) {
        return new JAXBElement<ConsultBookByTitle>(_ConsultBookByTitle_QNAME, ConsultBookByTitle.class, null, value);
    }

}
