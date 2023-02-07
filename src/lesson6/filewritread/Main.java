package lesson6.filewritread;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("fileWriter.txt",true)){
            fileWriter.write("Hello");
            fileWriter.append('C');
        } catch (IOException e){
            e.printStackTrace();
        }
        try(FileReader fileReader = new FileReader("fileWriter.txt")) {
            while (fileReader.ready()){
                System.out.println((char) fileReader.read());
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
