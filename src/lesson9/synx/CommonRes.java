package lesson9.synx;

public class CommonRes {
    int x;
    public synchronized void increment(){
        x=0;
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " +x++);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
