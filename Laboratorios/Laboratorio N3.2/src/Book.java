public class Book {
    private String title;
    private Author author;
    private double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getInfo() {
        return "Title: " + this.title + ", Author: " + this.author.name + ", Price: " + this.price;
    }

    // Agregar el siguiente método para establecer la relación bidireccional
    public void setAuthor(Author author) {
        this.author = author;
        author.addBook(this); // Agregar el libro al autor
    }
}