package lesson7;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        long num = 186110453660651L;
        List<Integer> list = method(transform(num));
        System.out.println(list);
        String str = method2(list,transform(num));
        System.out.println(str);
    }
    static List<Integer> method(char[] chars) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if (isEvenOrOdd(Character.getNumericValue(chars[i])) == 1) {
                list.add(1);
            } else if (isEvenOrOdd(Character.getNumericValue(chars[i])) == -1) {
                list.add(-1);
            } else {
                list.add(0);
            }
        }
        return list;
    }
    static int isEvenOrOdd(long x){
     if(x ==0)
         return 0;
     else if(x % 2 ==0)
         return 1;
     else return -1;
    }
    static String method2(List<Integer> list, char[] chars){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size()-1; i++) {
                if((list.get(i) == 1 && list.get(i+1) == 1)){
                    stringBuilder.append(chars[i]).append("*");
                } else if ((list.get(i) == -1 && list.get(i+1) == -1)) {
                    stringBuilder.append(chars[i]).append("+");
                } else if ((list.get(i) == 1 && list.get(i+1) == -1)) {
                    stringBuilder.append(chars[i]).append("!");
                } else if ((list.get(i) == -1 && list.get(i+1) == 1)) {
                    stringBuilder.append(chars[i]).append("?");
                }
                else
                    stringBuilder.append(chars[i]).append("&");

        }
        stringBuilder.append(chars[chars.length-1]);
        return stringBuilder.toString();
    }
    static char[] transform(long l){
        String s = String.valueOf(l);
        char[] chars = s.toCharArray();
        return chars;
    }
}
