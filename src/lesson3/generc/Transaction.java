package lesson3.generc;

public class Transaction <T extends Account<String,Integer>> {
    private T from;
    private T to;
    private int sumToTrans;

    public Transaction(T from, T to, int sumToTrans) {
        this.from = from;
        this.to = to;
        this.sumToTrans = sumToTrans;
    }

    public T getFrom() {
        return from;
    }

    public void setFrom(T from) {
        this.from = from;
    }

    public T getTo() {
        return to;
    }

    public void setTo(T to) {
        this.to = to;
    }

    public int getSumToTrans() {
        return sumToTrans;
    }

    public void setSumToTrans(int sumToTrans) {
        this.sumToTrans = sumToTrans;
    }
    public void execute(){
        if(from.getSum() > sumToTrans){
            from.setSum(from.getSum()-sumToTrans);
            to.setSum(to.getSum() + sumToTrans);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum(),to.getId(), to.getSum());
        }else{
            System.out.print("Operation is invalid");
        }
    }
}
