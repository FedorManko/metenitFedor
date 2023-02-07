package lesson3.abstr;

public class Client extends Person{
    private String bank;
    public Client(String name, int age,String bank) {
        super(name, age);
        this.bank = bank;
    }

    @Override
    public void display() {
        System.out.println(bank);
    }
}
