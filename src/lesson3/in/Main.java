package lesson3.in;

public class Main {
    public static void main(String[] args) {
        Person person =new Person("Fedor", 28);
        person.display();
    }
}
 class Person {
    private String name;
    private Account account;

    public Person(String name, int  password) {
        this.name = name;
        this.account = new Account(password);
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.printf("Person : %s, password : %d ",getName(),account.getPassword());
    }
    public class Account{
        private int password;

        public Account(int password) {
            this.password = password;
        }

        public int getPassword() {
            return password;
        }

        public void setPassword(int password) {
            Person person = Person.this;
            this.password = password;
        }
    }
}
