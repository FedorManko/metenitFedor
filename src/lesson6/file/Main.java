package lesson6.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        File file = new File("D://Учеба ИТ");
        for (File f: Objects.requireNonNull(file.listFiles())) {
            if(f.isDirectory()){
                System.out.println(f.getName() + " direct");
            } else
                System.out.println(f.getName());
        }
        File dir = new File("D://foka");
        dir.mkdir();
        File newDir = new File("D://foka2");
        dir.renameTo(newDir);
        File file1 = new File("D://foka2//text.txt");
        if(!file1.exists()){
            try {
                file1.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Exists");
        }
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        File dir2 = new File("D://Учеба ИТ");
        for (String f: Objects.requireNonNull(dir2.list())) {
            System.out.println(f);
        }
        try {
            Files.createFile(Paths.get("D://foka3.txt"));
            Path f = Files.createDirectory(Path.of("D://foka5"));
            System.out.println(Files.exists(f));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
