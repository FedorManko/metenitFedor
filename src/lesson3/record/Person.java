package lesson3.record;

public record Person(String name,int age) {
    public Person{
        if(age<1 || age > 110){
            age = 18;
        }
    }
    static int minAge;
    static{
        minAge = 18;
        System.out.println("Static initializer");
    }

    @Override
    public String name() {
        return "Mister" + name;
    }
    public Person(String firstName, String lastName, int age){

        this(firstName + " " + lastName, age);

    }
}
