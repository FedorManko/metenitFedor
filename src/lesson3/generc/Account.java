package lesson3.generc;

public class Account <T,S> implements Accountable<T> {
    private T id;
    private S sum;

    public Account(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public S getSum() {
        return sum;
    }

    public void setSum(S sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }

    @Override
    public T method() {
        return null;
    }

    @Override
    public void print() {

    }
}
