package lesson9.sem;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 1; i < 6; i++) {
            new Thread(new Car(semaphore,i),"i").start();
        }
    }
}
