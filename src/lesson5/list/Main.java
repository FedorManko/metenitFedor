package lesson5.list;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> people = new ArrayList<String>();
        // добавим в список ряд элементов
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // добавляем элемент по индексу 1

        System.out.println(people.get(1));// получаем 2-й объект
        people.set(1, "Robert"); // установка нового значения для 2-го объекта

        System.out.printf("ArrayList has %d elements \n", people.size());
        for(String person : people){

            System.out.println(person);
        }
        // проверяем наличие элемента
        if(people.contains("Tom")){

            System.out.println("ArrayList contains Tom");
        }

        // удалим несколько объектов
        // удаление конкретного элемента
        people.remove("Robert");
        // удаление по индексу
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for(Object person : peopleArray){

            System.out.println(person);
        }
        List<String> strings = new ArrayList<>(people);
        strings.add("Fedor");
        strings.add("Foka");
        System.out.println(strings);
        strings.removeIf(s -> s.startsWith("F"));
        System.out.println(strings);
        strings.addAll(people);
        System.out.println(strings);
        strings.set(5,"Leroi");
        System.out.println(strings);
        strings.replaceAll(String::toUpperCase);
        System.out.println(strings);
        System.out.println("-----------");
        ListIterator<String> listIterator = strings.listIterator();
        while (listIterator.hasNext()){
            if(listIterator.next().equals("ALICE"))
                listIterator.remove();
            else if (listIterator.next().equals("SAM"))
                listIterator.add("FOKA");

        }
        System.out.println(strings);

    }
}
