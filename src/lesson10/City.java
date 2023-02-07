package lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class City {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Paris","Berlin","Minsk"));
        Collections.addAll(list,"Moscow","London","Chicago");
        System.out.println(list);
        list.stream().filter(element->element.length()>6).forEach(System.out::println);
        IntStream intStream = IntStream.of(1,5,6);
        System.out.println(intStream.average().getAsDouble());
        String[] cities = {"Париж", "Лондон", "Мадрид"};
        Stream<String> stream = Arrays.stream(cities);
        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        citiesStream.filter(s->s.length()==6).forEach(s->System.out.println(s));
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));
        phoneStream.filter(phone -> phone.getPrice() < 50000).filter(phone -> phone.getName().length()> 10).forEach(System.out::println);
        phoneStream = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));
        phoneStream.map(Phone::getName).forEach(System.out::println);
        phoneStream = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));
        phoneStream.mapToInt(phone->phone.getPrice() + phone.getName().length()).forEach(System.out::println);
        phoneStream = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));
        phoneStream.flatMap(phone -> Stream.of(String.format(phone.getPrice() + " "),String.format(phone.getPrice()-0.1*phone.getPrice()+ " "))).forEach(System.out::println);
    }
}
