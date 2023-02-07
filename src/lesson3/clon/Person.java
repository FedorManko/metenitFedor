package lesson3.clon;

import java.util.Objects;

public class Person implements Cloneable {
    private String name;
    private Book book;

    public Person(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(book, person.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, book);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", book=" + book +
                '}';
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.book =book.clone();
        return person;
    }
}
