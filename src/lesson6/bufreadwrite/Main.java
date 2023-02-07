package lesson6.bufreadwrite;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bufWrit.txt"))){
            bufferedWriter.write("Fedor play\n World of Warcraft");
        } catch (IOException e){
            e.printStackTrace();
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("bufWrit.txt"))){
            while (bufferedReader.ready()) {
                String str = bufferedReader.readLine();
                System.out.println(str);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("console.txt"))) {
            String text;
            while (!(text =bufferedReader.readLine()).equals("Esc")){
                bufferedWriter.write(text);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))){
            bufferedWriter.write("LOL");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
