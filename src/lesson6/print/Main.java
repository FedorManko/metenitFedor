package lesson6.print;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try(PrintWriter printWriter = new PrintWriter(new FileOutputStream("pw.text"));) {
            printWriter.println("Fedor");
            printWriter.print("Manko");
            printWriter.write("Hello");
        } catch (IOException e){
            e.printStackTrace();
        }
        PrintStream printStream = new PrintStream(System.out);
        printStream.println(12);
        byte[] b = "Hello11".getBytes();

        try {
            printStream.write(b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
