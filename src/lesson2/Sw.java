package lesson2;

import java.util.Random;

public class Sw {
    public static void main(String[] args) {
        int x = new Random().nextInt(6)+1;
        switch (x){
            case 1: System.out.println("1");break;
            case 2: System.out.println("2");break;
            case 3: System.out.println("3");break;
            case 4: System.out.println("4");break;
            case 5: System.out.println("5");break;
            default: System.out.println("6");break;
        }
        for (int i = 0; i < 10; i++) {
            if(i==5)
                break;
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if(i==5)
                continue;
            System.out.println(i);
        }
    }
}
