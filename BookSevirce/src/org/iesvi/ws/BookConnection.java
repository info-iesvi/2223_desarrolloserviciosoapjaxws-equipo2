package org.iesvi.ws;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
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
        Document doc = documentBuilder.parse("examplesBooks.xml");
        Element books = doc.getDocumentElement();
        Element book = doc.createElement("book");
        Element id = doc.createElement("id");
        Element title = doc.createElement("title");
        Element author = doc.createElement("author");
        Element editorial = doc.createElement("editorial");
        Element stock = doc.createElement("stock");
        Element condition = doc.createElement("condition");
        Element prize = doc.createElement("prize");

        books.appendChild(book);
        book.appendChild(id);
        book.appendChild(title);
        book.appendChild(author);
        book.appendChild(editorial);
        book.appendChild(stock);
        book.appendChild(condition);
        book.appendChild(prize);

       // id.setTextContent();
    }
}
