package lesson8.constt;

public class Main {
    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;
        User user = userBuilder.createUser("Fedor");
        System.out.println(user.getName());
    }
}
