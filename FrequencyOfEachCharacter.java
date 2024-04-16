package Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {

    public static void main(String[] args)
    {
        String inputString = "Java Concept Of The Day";

//        Map<String, Long> map = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(map);


        Map<String,Long> map=Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
