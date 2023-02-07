package lesson3.clon;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("LOTR");
        Book book1 = book.clone();
        Person tom = new Person("Tom",book);
        System.out.println(tom);

        try {
            Person bob = tom.clone();
            bob.setName("Bob");
            book1.setTitle("LOL");
            bob.setBook(book1);
            System.out.println(bob);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(tom);
    }
}
