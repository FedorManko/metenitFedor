package lesson6.zip;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) {
        try(ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream("D:\\foka\\outpur.zip"));
            FileWriter fileWriter = new FileWriter("D:\\foka\\file.txt")) {
            fileWriter.write("Fedor");
            zipOutputStream.putNextEntry(new ZipEntry("file.txt"));

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
