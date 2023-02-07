package lesson9.th;

public class MainNew {
    public static void main(String[] args) {
        Th th = new Th("Fedor");
        th.start();
    }
}
class Th extends Thread{
    Thread t;
    public Th(String name) {
        super(name);
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 6; i++) {
            System.out.println(i + " " + name);
        }
    }
}
