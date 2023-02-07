package lesson9.th;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        MyThread myThread = new MyThread("FokaTh");
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(myThread);
        System.out.println("Main thread finished");
    }
}
class MyThread extends Thread{
    public MyThread(String name) {
       super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}