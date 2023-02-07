package lesson5.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("Fedor");
        stringSet.add("Boris");
        stringSet.add("Mark");
        System.out.println(stringSet);
        SortedSet<String> stringSortedSet = new TreeSet<>(stringSet);
        SortedSet<String> strings = stringSortedSet.headSet("Mark");
        System.out.println(strings);
        strings.add("Leori");
        strings.add("Helen");
        NavigableSet<String> navigableSet = new TreeSet<>(strings);
        System.out.println(navigableSet);
        String s = navigableSet.ceiling("Lady");
        System.out.println(s);
        NavigableSet<String> strings1 = navigableSet.headSet("Helen",true);
        System.out.println(strings1);

    }
}
