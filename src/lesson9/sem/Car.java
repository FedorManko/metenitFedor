package lesson9.sem;

import java.util.concurrent.Semaphore;

public class Car implements Runnable {
    Semaphore semaphore;
    int id;
    int num;

    public Car(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (num<3){
                semaphore.acquire();
                System.out.println("Машина : " + id + " ремонтируется");
                Thread.sleep(1000);
                num++;
                System.out.println("Машина : " + id + " отремонтирована");
                semaphore.release();
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
