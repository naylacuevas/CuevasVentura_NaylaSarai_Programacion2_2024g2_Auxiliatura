import java.util.ArrayList;
import java.util.List;

public class Author {
    String name;
    private List<Book> books;

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public void addBook(String title, double price) {
        Book newBook = new Book(title, this, price);
        this.addBook(newBook);
    }
}