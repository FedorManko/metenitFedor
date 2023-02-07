package lesson7.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "FIFA  ,will !never ?regret it";
        String[] strings = str.split("\\s+(!|,|\\.|\\?)*");
        Arrays.stream(strings).forEach(System.out::println);
        String input = "+12343454556";
        boolean result = input.matches("(\\+*)\\d{11}");
        if(result){
            System.out.println("It is a phone number");
        }
        else{
            System.out.println("It is not a phone number!");
        }
        String str1 = "51564646446 5456!6465 453* 66";
        Pattern pattern = Pattern.compile("\\d+(!|\\*)*\\d*\\s*");
        Matcher matcher = pattern.matcher(str1);
        while (matcher.find()){
            System.out.println(matcher.group());

        }
        str1 =matcher.replaceAll("Foka");
        System.out.println(str1);
        String input1 = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern1 = Pattern.compile("Java(\\w*)");
        Matcher matcher1 = pattern1.matcher(input1);
        while(matcher1.find())
            System.out.println(matcher1.group());
        System.out.println("_______________________");
        String input3 = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern3 = Pattern.compile("[ ,.!?]");
        Matcher matcher2 = pattern3.matcher(input3);
        while (matcher2.find()){
            System.out.println(matcher2.group());
        }
        System.out.println("_______________________");
        String[] words = pattern3.split(input3);
        for(String word:words)
            System.out.println(word);
    }
}
