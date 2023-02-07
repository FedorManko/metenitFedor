package lesson9.synx;

public class Th implements Runnable{
    CommonRes commonRes;

    public Th(CommonRes commonRes) {
        this.commonRes = commonRes;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        commonRes.increment();
        System.out.printf("%s finished... \n", name);
    }
}
