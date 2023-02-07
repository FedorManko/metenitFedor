package lesson8.inin;

import lesson2.Scan;

import java.util.Scanner;
import java.util.function.Supplier;

public class Sup {
    public static void main(String[] args) {
        Supplier<User> userSupplier =()->{
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            return new User(name);
        };
        User user = userSupplier.get();
        System.out.println(user.getName());
    }
}
class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
