package lesson3.extend;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Fedor",28,"IBG");
        employee.display();
        employee.setCompany("Epam");
        Person person = new Person("IlYa",12);
        person.display();
        Person person1 = new Employee("Mark",28,"Leroi");
        person1.display();

    }
}
