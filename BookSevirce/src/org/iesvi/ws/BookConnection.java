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

import static java.lang.Integer.parseInt;

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

    public void deleteXmlData(String xmlName, String idBook) throws Exception {
        Document document = readXml(xmlName);
        Element books = document.getDocumentElement();

        NodeList bookList = books.getElementsByTagName("book");
        Node item = bookList.item(parseInt(idBook));

        for (int i = 0; i < bookList.getLength(); i++) {
            Element element = (Element) bookList.item(i);
            if (element.getAttribute("idBook").equalsIgnoreCase(idBook)) {
                books.getParentNode().removeChild(item);
            } else {
                System.out.println("Book not found");
            }
        }

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        Source source = new DOMSource(document);
        Result result = new StreamResult(xmlName);
        transformer.transform(source, result);
    }

    public void updateXmlData(String xmlName, String idBook, String option) throws Exception {
        Document document = readXml(xmlName);
        Element books = document.getDocumentElement();

        NodeList bookList = books.getElementsByTagName("book");
        Node item = bookList.item(parseInt(idBook));

        for(int i = 0; i < bookList.getLength(); i++){
            Element element = (Element) bookList.item(i);
            if (element.getAttribute("idBook").equalsIgnoreCase(idBook)){
                if(option.compareToIgnoreCase("stock")==0){
                    element.getAttribute("stock").replace(element.getAttribute("stock"), Keyboard.getString("New stock: "));
                } else if (option.compareToIgnoreCase("prize")==0) {
                    element.getAttribute("prize");
                } else if (option.compareToIgnoreCase("condition")==0) {
                    element.getAttribute("condition");
                }
            } else {
                System.out.println("Book not found");
            }
        }
    }
}
