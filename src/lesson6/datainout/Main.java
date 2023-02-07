package lesson6.datainout;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Fedor",28,1.90, false);
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data.txt"));) {
                dataOutputStream.writeUTF(person.getName());
                dataOutputStream.writeInt(person.getAge());
                dataOutputStream.writeDouble(person.getHeight());
                dataOutputStream.writeBoolean(person.isMarried());
        } catch (IOException e){
            e.printStackTrace();
        }
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("data.txt"));) {
            String name = dataInputStream.readUTF();
            int age = dataInputStream.readInt();
            double height = dataInputStream.readDouble();
            boolean married = dataInputStream.readBoolean();
            Person person1 = new Person(name,age,height,married);
            System.out.println(person1);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
