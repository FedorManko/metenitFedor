package geekforgeeks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(compareNM(5,6));
        System.out.println(delAlternate("Fokas"));
        System.out.println(MissingNumber(new int[] {6,1,2,8,3,4,7,10,5},10));
    }
    static String compareNM(int n,int m){
        if(n < m){
            return "lesser";
        } else if(n > m){
            return "greater";
        }
        else
            return "equal";
    }
    static String delAlternate(String S) {

        char[] chars = S.toCharArray();
        String str ="" + chars[0];
        for (int i = 1; i < chars.length; i++) {
            if(i % 2 !=0)
             str+=chars[i];
        }
        return str;
    }
    static int MissingNumber(int array[], int n) {
        Integer[] a = Arrays.stream(array).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(a);
        for (int i = 1; i <=10 ; i++) {
            if(!list.contains(i)){
                return i;
            }
        }
        return 0;
    }
}
