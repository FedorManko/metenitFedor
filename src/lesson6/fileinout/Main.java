package lesson6.fileinout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String text = "Hello World";
        try (FileOutputStream fileOutputStream = new FileOutputStream("file.txt",true)){
            byte[] bytes = text.getBytes();
            fileOutputStream.write(bytes[0]);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        StringBuilder str = new StringBuilder();
        try (FileInputStream fileInputStream = new FileInputStream("file.txt")){
            int x;
            while ((x = fileInputStream.read())!=-1) {
                str.append((char) x);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(str);
        try (FileInputStream fileInputStream1 = new FileInputStream("file.txt")){
            byte[] b = new byte[fileInputStream1.available()];
            fileInputStream1.read(b,0, fileInputStream1.available());
            for (int i = 0; i < b.length; i++) {
                System.out.println((char) b[i]);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
