package lesson3.generc;

public class Person<T> {
    private T id;

    public Person(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
