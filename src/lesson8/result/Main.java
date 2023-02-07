package lesson8.result;

public class Main {
    public static void main(String[] args) {
        System.out.println(action(2).print(5,10));
    }
    private static Pri action(int number){
        return switch (number) {
            case 1 -> Integer::sum;
            case 2 -> (x, y) -> x - y;
            case 3 -> (x, y) -> x * y;
            default -> (x, y) -> 0;
        };
    }
}
