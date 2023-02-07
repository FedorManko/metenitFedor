package lesson3.ex;

public class MyEx extends Exception{
    @Override
    public String getMessage() {
        return "FOKA";
    }

    public MyEx() {
    }
}
