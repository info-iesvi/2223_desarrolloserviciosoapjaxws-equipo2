package org.iesvi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bookImpl complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bookImpl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editorial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idBook" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookImpl", propOrder = {
    "author",
    "condition",
    "editorial",
    "idBook",
    "prize",
    "stock",
    "title"
})
public class BookImpl {

    protected String author;
    protected String condition;
    protected String editorial;
    protected int idBook;
    protected double prize;
    protected int stock;
    protected String title;

    /**
     * Obtiene el valor de la propiedad author.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Define el valor de la propiedad author.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Obtiene el valor de la propiedad condition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Define el valor de la propiedad condition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Obtiene el valor de la propiedad editorial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Define el valor de la propiedad editorial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditorial(String value) {
        this.editorial = value;
    }

    /**
     * Obtiene el valor de la propiedad idBook.
     * 
     */
    public int getIdBook() {
        return idBook;
    }

    /**
     * Define el valor de la propiedad idBook.
     * 
     */
    public void setIdBook(int value) {
        this.idBook = value;
    }

    /**
     * Obtiene el valor de la propiedad prize.
     * 
     */
    public double getPrize() {
        return prize;
    }

    /**
     * Define el valor de la propiedad prize.
     * 
     */
    public void setPrize(double value) {
        this.prize = value;
    }

    /**
     * Obtiene el valor de la propiedad stock.
     * 
     */
    public int getStock() {
        return stock;
    }

    /**
     * Define el valor de la propiedad stock.
     * 
     */
    public void setStock(int value) {
        this.stock = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
