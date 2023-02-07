package lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Hello Fedor";
        char[] c = str.toCharArray();
        System.out.println(Arrays.toString(c));
        System.out.println(str.concat(" WOW"));
        System.out.println(str);
        System.out.println(str.charAt(2));
        System.out.println(str.length());
        String str1 = str;
        String str2 = new String("Hello Fedor");
        System.out.println(str.equals(str1));
        System.out.println(str == str1);
        System.out.println(str.equals(str2));
        System.out.println(str == str2);
        String str4 = String.join("*",str1,str2);
        System.out.println(str4);
        char [] chars = new char[str4.length()+10];
        str4.getChars(0,str4.length(),chars,2);
        System.out.println(Arrays.toString(chars));
        System.out.println(str4.substring(3,8));
        StringBuilder stringBuilder = new StringBuilder("Java");
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.charAt(2));
        stringBuilder.setCharAt(3,'X');
        System.out.println(stringBuilder);
        stringBuilder.append("Wow");
        System.out.println(stringBuilder);
        stringBuilder.insert(3,10);
        System.out.println(stringBuilder);
        stringBuilder.replace(3,6,"sss");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
