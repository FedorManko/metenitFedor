package lesson9.run;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main started");
        Thread thread = new Thread(new MyTh(),"Foka");
        thread.start();
        Runnable runnable=()->{
            System.out.println("Foka2 started");
            String name = Thread.currentThread().getName();
            for (int i = 0; i < 5; i++) {
                System.out.println(i+  " " + name);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Foka2 finished");
        };
        Thread thread1 = new Thread(runnable,"Foka2");
        thread1.start();
        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main finished");


    }
}
class MyTh implements Runnable{

    @Override

    public void run() {
        System.out.println("Foka started");
        String name = Thread.currentThread().getName();
        for (int i = 5; i > 0; i--) {
            System.out.println(i + " " + name);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Foka finished");
    }
}
