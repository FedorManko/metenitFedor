package lesson2;

import java.util.*;

public class Ar {
    public static void main(String[] args) {
      int[] array = new int[new Random().nextInt(10)+5];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10)+1;
        }
        System.out.println(Arrays.toString(array));
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])) {
                for (Map.Entry<Integer,Integer> pair: map.entrySet()) {
                    if(pair.getKey().equals(array[i])){
                        map.put(array[i],pair.getValue()+1);
                    }
                }
            } else {
                map.put(array[i],1);
            }

        }
        System.out.println(map);
    }

}
