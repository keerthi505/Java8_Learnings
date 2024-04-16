package Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagaramsOrNot {
public static void main(String[] args){
    String s1="abcd";
    String s2="mom";

    s1=Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

    s2=Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

    if(s1.equals(s2)){
        System.out.println("anagrams");
    }
    else{
        System.out.println("not anagrams");
    }
}


}
