package lesson3.abstr;



public class Main {
    public static void main(String[] args) {
        Person person = new Person("Fedor",28) {
            @Override
            public void display() {
                System.out.println(getAge() + " " +getName());
            }
        };
        person.display();
        person.sayHello();
        Person client = new Client("Tom",29,"Epam");
        client.sayHello();
        client.display();
        Object emp = new Employee("Leroi",22);
        if(emp instanceof Client e){
            e.display();
        } else if(emp instanceof Employee ee) {
            ee.display();
        }
    }
}
