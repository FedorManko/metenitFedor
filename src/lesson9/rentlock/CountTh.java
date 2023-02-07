package lesson9.rentlock;

import java.util.concurrent.locks.ReentrantLock;

public class CountTh implements Runnable{
    Common common;
    ReentrantLock reentrantLock;

    public CountTh(Common common, ReentrantLock reentrantLock) {
        this.common = common;
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {
        reentrantLock.lock();
        try {
            common.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), common.x);
                common.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e){
            e.getMessage();
        }
        finally {
            reentrantLock.unlock();
        }
    }
}
