package lesson10.sort;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<String>();
        Collections.addAll(phones, "iPhone X", "Nokia 9", "Huawei Nexus 6P",
                "Samsung Galaxy S8", "LG G6", "Xiaomi MI6",
                "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6",
                "Pixel 2");
        phones.stream().filter(p->p.length() < 10).sorted().forEach(System.out::println);
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",650),
                new Phone("Nokia 9", "HMD Global",150),
                new Phone("Galaxy S9", "Samsung", 300));
        phoneStream.sorted(Comparator.comparingInt(Phone::getPrice).reversed().thenComparing(Phone::getCompany)).forEach(System.out::println);
        Stream<Integer> intStream = Stream.of(1,3,4,5,6,-5);
        intStream.takeWhile(x->x>0).forEach(System.out::println);
        intStream = Stream.of(1,3,4,5,6,-5);
        intStream.dropWhile(x->x>0).forEach(System.out::println);
        intStream = Stream.of(1,4,5,5,6,-5);
        intStream.distinct().forEach(System.out::println);
        phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",650),
                new Phone("Nokia 9", "HMD Global",150),
                new Phone("Galaxy S9", "Samsung", 300));
        phoneStream.skip(2).limit(10).forEach(System.out::println);
        ArrayList<String> names = new ArrayList<>(List.of("Tom", "Sam", "Bob", "Alice"));
        System.out.println(names.stream().filter(s -> s.length()>4).count());
        System.out.println(names.stream().filter(s -> s.length()==3).findFirst().get());
        System.out.println(names.stream().filter(s -> s.length()==3).findAny().get());
        System.out.println(names.stream().allMatch(s -> s.length()==3));
        System.out.println(names.stream().anyMatch(s -> s.length()==5));
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(numbers.stream().min(Integer::compare));
        phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",650),
                new Phone("Nokia 9", "HMD Global",150),
                new Phone("Galaxy S9", "Samsung", 300));
        System.out.println(phoneStream.min(Comparator.comparing(Phone::getPrice)).get().getPrice());
        Stream<Integer> numberStream = Stream.of(-4, 3, -2, 1);
        System.out.println(numberStream.reduce((x,y)->x+y).get());
        numberStream = Stream.of(-4, 3, -2, 1);
        System.out.println(numberStream.reduce(10,(x,y)->x*y));
        Stream<Phone> phoneStream1 = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000),
                new Phone("LG G 4", 32000));

        int sum = phoneStream1.reduce(0,
                (x,y)-> {
                    if(y.getPrice()<50000)
                        return x + y.getPrice();
                    else
                        return x + 0;
                },
                Integer::sum);

        System.out.println(sum); // 117000
        ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7, 8, 9));
        System.out.println(numbers1.stream().min(Integer::compare).orElse(100));
        Optional<Integer> o = numbers1.stream().max(Integer::compare);
        o.ifPresent(System.out::println);
        System.out.println(o.orElseGet(()->new Random().nextInt(6)));
        System.out.println(o.orElseThrow(IllegalAccessError::new));
        ArrayList<Integer> i  =numbers1.stream().filter(integer -> integer > 6).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(i);
        Stream<Phone> phoneStream2 = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000),
                new Phone("LG G 4", 32000));
        Map<String,Integer> map = phoneStream2.collect(Collectors.toMap(Phone::getName, Phone::getPrice));
        System.out.println(map);
        Stream<Phone> phoneStream3 = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));
        Map<String,List<Phone>> map1 = phoneStream3.collect(Collectors.groupingBy(Phone::getCompany));
        for (Map.Entry<String,List<Phone>> elem:map1.entrySet()) {
            System.out.println(elem.getKey());
            for (Phone phone :elem.getValue()) {
                System.out.println(phone.getName());
            }
            System.out.println();
        }
        Stream<Phone> phoneStream4 = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));
        Map<Boolean, List<Phone>> phonesByCompany = phoneStream4.collect(
                Collectors.partitioningBy(p->p.getCompany()=="Apple"));

        for(Map.Entry<Boolean, List<Phone>> item : phonesByCompany.entrySet()){

            System.out.println(item.getKey());
            for(Phone phone : item.getValue()){

                System.out.println(phone.getName());
            }
            System.out.println();
        }
        phoneStream4 = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));
        Map<String,Long> map2 = phoneStream4.collect(Collectors.groupingBy(Phone::getCompany,Collectors.counting()));
        System.out.println(map2);
        phoneStream4 = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));
        Map<String,IntSummaryStatistics> intSummaryStatisticsMap = phoneStream4.collect(Collectors.groupingBy(Phone::getCompany,Collectors.summarizingInt(Phone::getPrice)));

        for (Map.Entry<String,IntSummaryStatistics> intSummaryStatisticsEntry: intSummaryStatisticsMap.entrySet()) {
            System.out.println(intSummaryStatisticsEntry.getValue().getAverage());
        }
        Phone[] phoness = new Phone[]{new Phone("iPhone 8", 54000),
                new Phone("Pixel 2", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("Nokia 9", 32000)};

        Arrays.parallelSetAll(phoness, l -> {
            phoness[l].setPrice(phoness[l].getPrice()-10000);
            return phoness[l];
        });

        for(Phone p: phoness){
            System.out.println(p);
        }
    }
}
