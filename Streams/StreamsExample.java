package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//to remove duplicate elements from a list
public class StreamsExample {
    public static void main(String[] args){
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> uniquestr=listOfStrings.stream().distinct().collect((Collectors.toList()));
        System.out.println(uniquestr);
    }
}
