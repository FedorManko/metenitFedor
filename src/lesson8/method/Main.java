package lesson8.method;

public class Main {
    public static void main(String[] args) {
        System.out.println(method(6,InterHelper::calculateMulti));
        System.out.println(method(6,InterHelper::calculateSum));
        InHelp inHelp = new InHelp();
        System.out.println(method(10,inHelp::calculateMulti));
        System.out.println(method(10,inHelp::calculateSum));
    }
    private static int method(int z, Inter inter){
        return z + inter.calculate(10,5);
    }
}
