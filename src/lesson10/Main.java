package lesson10;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0){
                sum+=numbers[i];
            }
        }
        System.out.println(sum);
        System.out.println(Arrays.stream(numbers).filter(x-> x>0).sum());
    }
}
