package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixAndSuffix {
    public static void main(String[] args){
        List<String> li= Arrays.asList("hello","world");
        String joined=li.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(joined);
    }
}
