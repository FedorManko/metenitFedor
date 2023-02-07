package lesson8.inin;

import java.util.function.Function;

public class Fun {
    public static void main(String[] args) {
        Function<Integer,String> stringFunction = s1-> s1 + "Foka";
        System.out.println(stringFunction.apply(5));
    }
}
