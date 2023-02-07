package lesson9.waitnot;

public class Program2 {
    public static void main(String[] args) {
        CarShop carShop = new CarShop();

       Thread thread =new Thread(new Producer2(carShop),"Producer");
       Thread thread1 =new Thread(new Seller(carShop),"Seller");
       thread.start();
       thread1.start();
    }
}
class CarShop{
    int carAmount=0;
    public synchronized void produce(){
        while (carAmount > 3){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        carAmount++;
        System.out.println("Машина произведена ");
        System.out.println("Машин в магазине: " + carAmount);
        notify();
    }
    public synchronized void sell(){
        while (carAmount < 1){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        carAmount--;
        System.out.println("Машина продана ");
        System.out.println("Машин в магазине: " + carAmount);
        notify();
    }

}
class Seller implements Runnable{
    CarShop carShop;

    public Seller(CarShop carShop) {
        this.carShop = carShop;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            carShop.sell();
        }
    }
}
class Producer2 implements Runnable{
    CarShop carShop;

    public Producer2(CarShop carShop) {
        this.carShop = carShop;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            carShop.produce();
        }
    }
}
