package lesson2;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int [] arr = new int[5];
        String [] arr1 = new String[5];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        int[] array ={1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
        System.out.println(Arrays.toString(array));
        for (int i: array) {
            i = i*2;
            System.out.println(i);
        }
        System.out.println(Arrays.toString(array));
        int[][] twoDim = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i <twoDim.length ; i++) {
            for (int j = 0; j <twoDim[i].length ; j++) {
                System.out.printf("Число: %d ",twoDim[i][j]);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(twoDim));
        System.out.println(twoDim[1][2]);
    }
}
