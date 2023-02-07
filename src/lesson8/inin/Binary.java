package lesson8.inin;

import java.util.function.BinaryOperator;

public class Binary {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (x1,x2)-> x1+x2;
        System.out.println(sum.apply(5,6));
    }
}
