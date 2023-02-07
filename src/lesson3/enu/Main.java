package lesson3.enu;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Tolkien","LOTR",BookType.PHANTASY);
        System.out.println(book);
        BookType bookType = BookType.valueOf("PHANTASY");
        System.out.println(bookType);
        BookType[] bookTypes = BookType.values();
        System.out.println(Arrays.toString(bookTypes));
        int num = bookType.ordinal();
        System.out.println(num);
        switch (book.getBookType()){
            case SCIENCE -> System.out.println("SCIENCE");
            case PHANTASY -> System.out.println("PHANTASY");
            case BELLETRE -> System.out.println("BELLETRE");
            case SCIENCE_FICTION -> System.out.println("SCIENCE_FICTION");
        }
        System.out.println(bookType.getYear());
        bookType.method();
        BookType bookType1 = BookType.PHANTASY;
        bookType1.method1();
    }
}
