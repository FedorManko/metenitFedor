package lesson3.generc;

public class Main {
    public static void main(String[] args) {
        Account<Integer,Integer> account = new Account<>(22,25);
        System.out.println(account);
        int id = account.getId();
        Account<String,Double> accountSt = new Account<>("Foka",25.5);
        String idSt = accountSt.getId();
        System.out.println(accountSt);
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
       method1(people);
       method1(numbers);
        Account<String,Integer> acc1 = new Account<>("1876", 4500);
        Account<String,Integer> acc2 = new Account<>("3476", 1500);
       Transaction<Account<String,Integer>> transaction = new Transaction<>(acc1,acc2,400);
       transaction.execute();
       Teacher<Integer,String> teacher = new Teacher<>(25,"English");
        System.out.println(teacher);
        Teacher<String,String> teacher1 = new Teacher<>("26","English");
        System.out.println(teacher1);
    }
    static <T> void method1(T[] items){
        for (T item:items) {
            System.out.println(item);
        }
    }
}
