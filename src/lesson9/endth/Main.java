package lesson9.endth;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main started");
        Thread thread = new Thread(new Th(),"Manko");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main finished");
    }
}
class Th implements Runnable{
    private boolean isActive;
    public Th() {
        isActive = true;
    }
    public void disable(){
        isActive = false;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " started");
        int count = 0;
        while (isActive) {
            if (count == 15) {
                disable();
            }
            System.out.println(count + " " + name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
        }
        System.out.println(name + " finished");
    }
}
