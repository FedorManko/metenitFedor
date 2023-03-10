package lesson3.abstr;

public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void display();
    public void sayHello(){
        System.out.println("Hello " +getName());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
