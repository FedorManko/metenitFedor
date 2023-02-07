package lesson5.map;



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Russia");
        map.put(2,"Germany");
        map.put(3,"France");
        map.put(4,"Belarus");
        System.out.println(map);
        Set<Integer> set = map.keySet();
        System.out.println(set);
        List<String> strings =new LinkedList<>(map.values());
        System.out.println(strings);
        map.putIfAbsent(5,"Poland");
        System.out.println(map);
        for (Map.Entry<Integer,String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Map< Person,Integer> map1 = new TreeMap<>();
        map1.put(new Person("Fedor",28),22);
        map1.put(new Person("Bob",27),2);
        System.out.println(map1);
    }

}
class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return o.age - this.age;
    }
}
