public class Main {
    public static void main(String[] args) {
       
        Author author = new Author("John Doe");
        Book book = new Book("El libro de John", author, 19.99);


        author.addBook("libro de John2", 9.99);

       
        System.out.println(book.getInfo());


        for (Book bookAuthor : author.getBooks()) {
            System.out.println(bookAuthor.getInfo());
        }
    }
}