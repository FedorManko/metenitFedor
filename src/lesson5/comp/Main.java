package lesson5.comp;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Fedor",28);
        Person person1 = new Person("Boris",23);
        Person person2 = new Person("Boris",24);
        Person person3 = new Person("Boris", 29);
        SortedSet<Person> people = new TreeSet<>();
        people.add(person);
        people.add(person1);
        System.out.println(people);

        NavigableSet<Person> personNavigableSet = new TreeSet<>(new PersonComparatorByAge());
        personNavigableSet.add(person);
        personNavigableSet.add(person1);
        System.out.println(personNavigableSet);

        Comparator<Person> comparator = new PersonComparatorByAge().thenComparing(new PersonComparatorByName());
        NavigableSet<Person> personNavigableSetNew = new TreeSet<>(comparator);
        personNavigableSetNew.add(person);
        personNavigableSetNew.add(person1);
        personNavigableSetNew.add(person2);
        personNavigableSetNew.add(person3);
        System.out.println(personNavigableSetNew);
    }
}
