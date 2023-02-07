package lesson6.bytet;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        byte[] bytes= {1,2,5,6,7};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        int i;
        while ((i=byteArrayInputStream.read())!=-1){
            System.out.println(i);
        }
        String str = "Hello Fedor!";
        byte[] bytes1 = str.getBytes();
        byteArrayInputStream= new ByteArrayInputStream(bytes1);
        int x;
        while ((x=byteArrayInputStream.read())!=-1){
            System.out.println((char) x);
        }
        System.out.println("-----");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.writeBytes(bytes1);
        byte[]bytes2 = byteArrayOutputStream.toByteArray();
        for (int j = 0; j < bytes2.length; j++) {
            System.out.println((char) bytes2[j]);
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream("byte.txt");){
            byteArrayOutputStream.writeTo(fileOutputStream);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
