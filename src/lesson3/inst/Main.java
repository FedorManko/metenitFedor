package lesson3.inst;

public class Main {
    public static void main(String[] args) {
        Person person =new Person("Fedor", new Person.Account(25));
        person.display();
        Person.Account account = new Person.Account(26);
        System.out.println(account.getPassword());
    }
}
 class Person {
    private String name;
    private Account account;

    public Person(String name, Account account) {
        this.name = name;
        this.account = account;
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
        System.out.printf("Person : %s, password : %d \n",getName(),account.getPassword());
    }
    public static class Account{
        private int password;

        public Account(int password) {
            this.password = password;
        }

        public int getPassword() {
            return password;
        }

        public void setPassword(int password) {
            this.password = password;
        }
    }
}
