package lesson3;

public class Person {
    private static int counter;
    private int age;
    private String name;
    static {
        counter = 5;
        System.out.println("Static init");
    }
    {
        System.out.println("Init");
        age = 10;
        name = "Wow";
    }
    public Person(){
        System.out.println("Constr");
        counter++;
    }
    public Person(String name) {
        this(18,name);
        System.out.println("Constr");
        counter++;
    }
    public Person(int age, String name) {
        setAge(age);
        setName(name);
        System.out.println("Constr");
        counter++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0 && age<100)
            this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.printf("Возраст : %d Имя : %s\n",age,name);
    }
    public static void getCounter(){
        System.out.println(counter);
    }
}
