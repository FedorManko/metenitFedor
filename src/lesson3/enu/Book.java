package lesson3.enu;

public class Book {
    private String name;
    private String author;
    private BookType bookType;

    public Book(String name, String author, BookType bookType) {
        this.name = name;
        this.author = author;
        this.bookType = bookType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", bookType=" + bookType +
                '}';
    }
}
