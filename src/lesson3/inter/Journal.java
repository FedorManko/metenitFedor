package lesson3.inter;

public class Journal implements Printable,Searchable{
    private String name;

    public Journal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

//    @Override
//    public void sell() {
//        System.out.println("Sell " + name);
//    }
}
