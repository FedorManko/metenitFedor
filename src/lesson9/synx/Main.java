package lesson9.synx;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        CommonRes commonRes = new CommonRes();
        for (int i = 0; i < 6; i++) {

            Thread thread = new Thread(new Th(commonRes),"Fedor : " +  i);
            thread.start();
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }

        System.out.println("Main thread finished...");
    }
}
