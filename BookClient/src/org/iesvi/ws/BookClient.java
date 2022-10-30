package org.iesvi.ws;

public class BookClient {
    public static void main (String[] args) {
        BookImplService bookService = new BookImplService();
        Book client = bookService.getBookImplPort();
        BookImpl book = new BookImpl();

        System.out.println("\n-- Consultar lista completa --");
        client.consultBookList();

        System.out.println("\n-- Consultar por Autor --");
        client.consultBookByAuthor("J.J. Williams");

        System.out.println("\n-- Consultar por Título --");
        client.consultBookByTitle("Microservices Architecture");

        System.out.println("\n-- Consultar por Editorial --");
        client.consultBookByEditorial("PSP");

        System.out.println("\n-- Añadir nuevo libro --");
        client.addBook(book);

        System.out.println("\n-- Modificar un libro --");
        client.deleteBook(book);

        System.out.println("\n-- Eliminar un libro --");
        client.updateBook(book);
    }
}
