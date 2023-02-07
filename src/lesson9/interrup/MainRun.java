package lesson9.interrup;

public class MainRun {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        Thread thread = new Thread(new Run(),"Fedor");
        thread.start();
        try {
            Thread.sleep(2000);
            thread.interrupt();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " interrupted " );
        }
        System.out.println("Main thread finished...");
    }
}
class Run implements Runnable{

    @Override
    public void run() {
        int count = 0;
        while (!Thread.currentThread().isInterrupted()){
            System.out.println(count);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
