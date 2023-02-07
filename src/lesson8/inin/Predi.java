package lesson8.inin;

import java.util.function.Predicate;

public class Predi {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x->x>0;
        System.out.println(predicate.test(10));
    }
}
