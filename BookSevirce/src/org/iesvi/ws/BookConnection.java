package org.iesvi.ws;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import org.w3c.dom.Element;
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

    public void readXml(String xmlName) throws ParserConfigurationException, SAXException {
        try {
            File file = new File(xmlName);
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            document.getDocumentElement().normalize();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void addXmlData() throws Exception {
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = documentBuilder.parse("repository/examplesBooks.xml");
        Element books = doc.getDocumentElement();
        Element book = doc.createElement("book");
        Element idBook = doc.createElement("id");
        Element title = doc.createElement("title");
        Element author = doc.createElement("author");
        Element editorial = doc.createElement("editorial");
        Element stock = doc.createElement("stock");
        Element condition = doc.createElement("condition");
        Element prize = doc.createElement("prize");

        books.appendChild(book);
        book.appendChild(idBook);
        book.appendChild(title);
        book.appendChild(author);
        book.appendChild(editorial);
        book.appendChild(stock);
        book.appendChild(condition);
        book.appendChild(prize);

        idBook.setTextContent(Keyboard.getString("ID: "));
        title.setTextContent(Keyboard.getString("TITLE: "));
        author.setTextContent(Keyboard.getString("AUTHOR: "));
        editorial.setTextContent(Keyboard.getString("EDITORIAL: "));
        stock.setTextContent(Keyboard.getString("STOCK: "));
        condition.setTextContent(Keyboard.getString("CONDITION: "));
        prize.setTextContent(Keyboard.getString("PRIZE: "));

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        Source source = new DOMSource(doc);
        Result result = new StreamResult("repository/examplesBooks.xml");
        transformer.transform(source, result);
    }

    public void deleteXmlData() {
        // TODO
    }

    public void updateXmlData() {
        // TODO
    }
}
