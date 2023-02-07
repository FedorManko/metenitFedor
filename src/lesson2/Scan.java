package lesson2;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext("[1-9]*")){
            System.out.println(scanner.nextLine());
        }
    }
}
