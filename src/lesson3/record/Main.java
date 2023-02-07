package lesson3.record;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Foka",0);
        Person person1 = new Person("Foka","Fedor",22);
        System.out.println(person.name());
        System.out.println(person.age());

    }
}
