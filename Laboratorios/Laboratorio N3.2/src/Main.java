public class Main {
    public static void main(String[] args) {
        // Crear un autor y un libro
        Author author = new Author("John Doe");
        Book book = new Book("El libro de John", author, 19.99);

        // Agregar el libro al autor (ya se hace en el constructor Book)
        // author.addBook(book); // No es necesario, se hace automáticamente

        // Agregar otro libro al autor de manera directa
        author.addBook("libro de John2", 9.99);

        // Mostrar información del libro
        System.out.println(book.getInfo());

        // Mostrar libros del autor
        for (Book bookAuthor : author.getBooks()) {
            System.out.println(bookAuthor.getInfo());
        }
    }
}