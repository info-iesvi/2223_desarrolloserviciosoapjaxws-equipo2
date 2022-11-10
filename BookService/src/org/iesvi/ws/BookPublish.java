package org.iesvi.ws;

import javax.xml.ws.Endpoint;

public class BookPublish {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:1516/WS/Books", new BookImpl());
        System.out.println("Active service, waiting for requests...");
    }
}
