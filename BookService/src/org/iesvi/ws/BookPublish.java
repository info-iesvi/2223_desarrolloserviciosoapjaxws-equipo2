package org.iesvi.ws;

import javax.xml.ws.Endpoint;

/**
 * Endpoint service
 */
public class BookPublish {
    public static void main (String[] args) {
        Endpoint.publish("http://localhost:1516/WS/Book",
                new BookImpl(BookModel.getTitle(), BookModel.getAuthor(), BookModel.getEditorial(),
                        BookModel.getStock(), BookModel.getCondition(), BookModel.getPrize()));
        System.out.println("Active service, waiting for requests...");
    }
}
