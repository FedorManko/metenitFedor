package lesson8.inin;

import java.util.function.Consumer;

public class Consum {
    public static void main(String[] args) {
        Consumer<Integer> consumer= x->System.out.printf("%d 5gsgdfg",x);
        consumer.accept(55);
    }
}
