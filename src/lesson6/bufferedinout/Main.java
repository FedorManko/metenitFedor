package lesson6.bufferedinout;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = {10,3,-4,5};
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("file.txt"));
        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new ByteArrayInputStream(bytes))) {
            int i;
            while ((i = bufferedInputStream.read())!=-1){
                System.out.println((char)i);
            }
            int x;
            while ((x = bufferedInputStream1.read())!=-1){
                System.out.println(x);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        byte[] bytes1 = "World of Warcraft Foka".getBytes();
        try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("buffile.txt",true))) {
            for (int i = 0; i < bytes1.length; i++) {
                bufferedOutputStream.write(bytes1[i]);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
