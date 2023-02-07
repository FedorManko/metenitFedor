package lesson3.generc;

public class Teacher<T,X> extends Person<T> {
    private X subject;
    public Teacher(T id, X subject) {
        super(id);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject=" + subject +
                '}' + "Id "+ getId();
    }
}
