package org.iesvi.ws;

public class BookClient {
    public static void main (String[] args) {
        BookImplService bookService = new BookImplService();
        Book client = bookService.getBookImplPort();
        BookImpl book = new BookImpl();

        System.out.println("\n-- Consultar lista completa --");
        client.getBookList();

        System.out.println("\n-- Consultar por Autor --");
        client.getBookByAuthor("J.J. Williams");

        System.out.println("\n-- Consultar por Título --");
        client.getBookByTitle("Microservices Architecture");

        System.out.println("\n-- Consultar por Editorial --");
        client.getBookByEditorial("PSP");

        System.out.println("\n-- Añadir nuevo libro --");
        book.setIdBook(4);
        book.setTitle("HTML 5 and CSS 3");
        book.setAuthor("Marc Josep");
        book.setEditorial("Garceta");
        book.setStock(3);
        book.setCondition("Good");
        book.setPrize(43.99);
        client.addBook(book);

        System.out.println("\n-- Modificar un libro --");
        book.getIdBook(1);
        book.setEditorial("Paraninfo");
        client.updateBook(book);

        System.out.println("\n-- Eliminar un libro --");
        book.getIdBook(1);
        client.deleteBook(book);
    }
}
