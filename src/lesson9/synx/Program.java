package lesson9.synx;

public class Program {

    public static void main(String[] args) {

        CommonResource commonResource= new CommonResource();
        System.out.println(commonResource.x);
        for (int i = 0; i < 4; i++) {
            Thread t = new Thread(new CountThread(commonResource));
            t.setName("Thread " + i);
            t.start();
        }



    }
}

class CommonResource{

    int x;
}

class CountThread implements Runnable{

    CommonResource res;
    CountThread(CommonResource res){
        this.res=res;
    }
    public void run(){

        synchronized(res){
            res.x=1;
            for (int i = 1; i < 5; i++){
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                try{
                    Thread.sleep(100);
                }
                catch(InterruptedException e){}
            }
        }
    }
}
