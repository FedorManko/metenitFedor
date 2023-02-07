package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Method {
    public static void main(String[] args) {
        sayHello();
        sayGoodbye();
        int x = new Random().nextInt(6)+1;
        int y = new Random().nextInt(6)+1;
        int z = countSum(x,y);
        System.out.println(z);
        writeString(10,"Hello", "Foka","Wow");
        writeString(1);
        System.out.println(isEven(10));
        System.out.println(daytime(7));
        daytime2(5);
    }
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayGoodbye(){
        System.out.println("Goodbye");
    }
    static int countSum(int x,int y){
        System.out.println(x +  " : " + y);
        return x + y;
    }
    static void writeString(int x, String... strings){
        System.out.println(x + " : " + Arrays.toString(strings));
    }
    static boolean isEven(int x){
        return x % 2 == 0;
    }
    static String daytime(int hour){

        if (hour >24 || hour < 0)
            return "Invalid data";
        else if(hour > 21 || hour < 6)
            return "Good night";
        else if(hour >= 15)
            return "Good evening";
        else if(hour >= 11)
            return "Good after noon";
        else
            return "Good morning";
    }
    static void daytime2(int hour){

        if (hour >24 || hour < 0)
            return;
        if(hour > 21 || hour < 6)
            System.out.println("Good night");
        else if(hour >= 15)
            System.out.println("Good evening");
        else if(hour >= 11)
            System.out.println("Good after noon");
        else
            System.out.println("Good morning");
    }
    static int sum(int x, int y){

        return x + y;
    }
    static double sum(double x, double y){

        return x + y;
    }
    static int sum(int x, int y, int z){

        return x + y + z;
    }
}
