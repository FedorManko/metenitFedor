package lesson3.inter;

public interface Printable {
    int X = 10;
    void print();
    default void sell(){

        System.out.println("Sell" + str());
    }
    private String str(){
        return "Hello";
    }
}
