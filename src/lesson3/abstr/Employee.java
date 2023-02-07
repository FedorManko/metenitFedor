package lesson3.abstr;

public class Employee extends Person{
    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    public void display() {
        System.out.println("employee");
    }
}
