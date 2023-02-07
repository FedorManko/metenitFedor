package lesson9.rentlock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Common common = new Common();
        ReentrantLock reentrantLock = new ReentrantLock();
        for (int i = 1; i < 6 ; i++) {
            Thread thread = new Thread(new CountTh(common,reentrantLock), "Thread : " + i);
            thread.start();
        }
    }
}
