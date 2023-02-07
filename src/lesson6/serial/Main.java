package lesson6.serial;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(new Person("Fedor",28,1.9,false),new Person("Mark",22,1.76,true)));
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("obj.txt"))){
            objectOutputStream.writeObject(people);
        } catch (IOException e){
            e.printStackTrace();
        }
        List<Person> peopleNew = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("obj.txt"))){
            peopleNew = ((List<Person>)objectInputStream.readObject());
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(peopleNew);
    }
}
