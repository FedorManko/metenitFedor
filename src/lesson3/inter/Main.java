package lesson3.inter;

public class Main {
    public static void main(String[] args) {
        Printable printable = new Book("Tolkien","Lotr");
        printable.print();
        Printable journal = new Journal("FokaJournal");
        journal.print();
        String name = ((Journal)journal).getName();
        System.out.println(name);
        journal.sell();
        System.out.println(journal.X);
        Inter.Readable i = new Journal("LOL");
        Printable printable1 = createPrintable("Harry Potter", true);
        printable1.print();
        method(printable);

    }
    static Printable createPrintable(String name, boolean bool){
        if(bool)
            return new Book(name,"Kane");
        else
            return new Journal(name);
    }
    static void method(Printable p){
       p.print();
    }
}
