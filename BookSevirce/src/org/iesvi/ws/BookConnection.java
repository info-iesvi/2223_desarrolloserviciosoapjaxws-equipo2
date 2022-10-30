package org.iesvi.ws;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import util.Keyboard;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class BookConnection {

    public Document readXml(String xmlName) throws Exception {
        Document document = null;
        try {
            File file = new File(xmlName);
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.parse(file);
            document.getDocumentElement().normalize();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }

    public void addXmlData(String xmlName) throws Exception {
        Document document = readXml(xmlName);
        Element books = document.getDocumentElement();
        Element book = document.createElement("book");
        Element idBook = document.createElement("id");
        Element title = document.createElement("title");
        Element author = document.createElement("author");
        Element editorial = document.createElement("editorial");
        Element stock = document.createElement("stock");
        Element condition = document.createElement("condition");
        Element prize = document.createElement("prize");

        books.appendChild(book);
        book.appendChild(idBook);
        book.appendChild(title);
        book.appendChild(author);
        book.appendChild(editorial);
        book.appendChild(stock);
        book.appendChild(condition);
        book.appendChild(prize);

        idBook.setTextContent(Keyboard.getString("ID: "));

        // TODO: Controlar que el idBook no exista para seguir pidiendo el resto de datos del libro
        title.setTextContent(Keyboard.getString("TITLE: "));
        author.setTextContent(Keyboard.getString("AUTHOR: "));
        editorial.setTextContent(Keyboard.getString("EDITORIAL: "));
        stock.setTextContent(Keyboard.getString("STOCK: "));
        condition.setTextContent(Keyboard.getString("CONDITION: "));
        prize.setTextContent(Keyboard.getString("PRIZE: "));

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        Source source = new DOMSource(document);
        Result result = new StreamResult(xmlName);
        transformer.transform(source, result);
    }

    public void deleteXmlData(String xmlName) throws Exception {
        Document document = readXml(xmlName);
        Element books = document.getDocumentElement();

        NodeList bookList = books.getElementsByTagName("books");
        Node item = bookList.item(Keyboard.getInteger("Which book do you want to delete? Insert the idBook: "));

        // TODO: Controlar que exista el libro o no antes de borrarlo
        books.removeChild(item);

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        Source source = new DOMSource(document);
        Result result = new StreamResult(xmlName);
        transformer.transform(source, result);
    }

    public void updateXmlData(String xmlName) throws Exception {
        Document document = readXml(xmlName);
        // TODO
    }
}
