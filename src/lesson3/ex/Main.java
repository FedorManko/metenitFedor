package lesson3.ex;

public class Main {
    public static void main(String[] args) {
        int x =10;
        int y =5;
        if(x/y == 2){
            try {
                throw new MyEx();
            } catch (MyEx e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
