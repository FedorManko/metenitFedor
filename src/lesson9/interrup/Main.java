package lesson9.interrup;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        JThread jThread = new JThread("Fedor");
        jThread.start();
        try {
            Thread.sleep(10000);
            jThread.interrupt();
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(jThread.getName() + " interrupted " );
        }
        try {
            jThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread finished...");
    }
}
class JThread extends Thread{
    public JThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.printf("%s started... \n", name);
        int counter=1; // счетчик циклов
        while(!isInterrupted()){
            System.out.println("Loop " + counter++);
            if(counter == 25){
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(name + " has been interrupted");
                System.out.println(Thread.currentThread().isInterrupted());
                //throw new RuntimeException(e);
                try {
                    interrupted();
                    Thread.sleep(5000);// false
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        System.out.printf("%s finished... \n", name);
    }
}
