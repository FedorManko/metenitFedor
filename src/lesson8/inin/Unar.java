package lesson8.inin;

import java.util.function.UnaryOperator;

public class Unar {
    public static void main(String[] args) {
        UnaryOperator<Integer> un= x1-> 10-x1;
        System.out.println(un.apply(9));
    }
}
