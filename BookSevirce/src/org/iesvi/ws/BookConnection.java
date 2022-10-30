package org.iesvi.ws;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.w3c.dom.*;

import util.Keyboard;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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

    public int saveXml(String xmlName) {
        try {
            Document document = readXml(xmlName);
            OutputFormat format = new OutputFormat(document);
            format.setIndenting(true);
            XMLSerializer serializer = new XMLSerializer(Files.newOutputStream(Paths.get(xmlName)), format);
            serializer.serialize(document);
            return 0;
        } catch (Exception e) {
            return -1;
        }
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

        NodeList bookList = books.getElementsByTagName("book");

        String id = Keyboard.getString("ID: ");
        idBook.setTextContent(id);

        for (int i = 0; i < bookList.getLength(); i++) {
            Element element = (Element) bookList.item(i);
            if (!(element.getAttribute("idBook").equalsIgnoreCase(id))) {
                title.setTextContent(Keyboard.getString("TITLE: "));
                author.setTextContent(Keyboard.getString("AUTHOR: "));
                editorial.setTextContent(Keyboard.getString("EDITORIAL: "));
                stock.setTextContent(Keyboard.getString("STOCK: "));
                condition.setTextContent(Keyboard.getString("CONDITION: "));
                prize.setTextContent(Keyboard.getString("PRIZE: "));
            } else {
                System.out.println("The book with this id already exists");
            }
        }

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        Source source = new DOMSource(document);
        Result result = new StreamResult(xmlName);
        transformer.transform(source, result);

        saveXml(xmlName);
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

        saveXml(xmlName);
    }

    public void updateXmlData(String xmlName, String idBook, String option) throws Exception {
        Document document = readXml(xmlName);
        Element books = document.getDocumentElement();

        NodeList bookList = books.getElementsByTagName("book");

        for(int i = 0; i < bookList.getLength(); i++){
            Element element = (Element) bookList.item(i);
            if (element.getAttribute("idBook").equalsIgnoreCase(idBook)){
                if(option.compareToIgnoreCase("stock")==0){
                    element.setAttribute("stock", Keyboard.getString("New stock: "));
                } else if (option.compareToIgnoreCase("prize")==0) {
                    element.setAttribute("prize", Keyboard.getString("New prize: "));
                } else if (option.compareToIgnoreCase("condition")==0) {
                    element.setAttribute("condition", Keyboard.getString("New condition: "));
                }
            } else {
                System.out.println("Book not found");
            }
        }

        saveXml(xmlName);
    }
}
