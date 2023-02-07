package lesson3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(28,"Fedor");
        person.display();
        Person.getCounter();
        Person person1 = new Person();
        person1.display();
        Person.getCounter();
        Person person2 = new Person("Lol");
        person2.display();
        Person.getCounter();
        person.setAge(200);
        person.display();
        changeName(person);
        person.display();
        changeName2(person);
        person.display();
    }
    static void changeName(Person p){
        p.setName("Leroi");
    }

    static void changeName2(Person p){
        p = new Person("Anton");
         p.setName("Max");
         p.display();
    }
}
