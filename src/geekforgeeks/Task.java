package geekforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        int [] v1 = {3, 4, 2, 2, 4};
        int [] v2 = {3, 2, 2, 7,4,5,5};
        System.out.println(common_element(v1,v2));
    }

    public static List<Integer> common_element(int v1[], int v2[]){
        List<Integer> list = new ArrayList<>();
        int[] v1s= Arrays.stream(v1).sorted().toArray();
        System.out.println(Arrays.toString(v1s));
        int[] v2s= Arrays.stream(v2).sorted().toArray();
        System.out.println(Arrays.toString(v2s));
        int length = 0;
        if(v1s.length > v2s.length){
            length = v2s.length;
        } else {
            length = v1s.length;
        }
        for (int i = 0; i < length; i++) {
                if(v1s[i] == v2s[i]){
                    list.add(v1s[i]);
            }
        }
        return list;
    }

}
