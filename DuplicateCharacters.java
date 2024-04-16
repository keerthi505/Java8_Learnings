package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacters {
public static void main(String[] args){
    List<String> li= Arrays.asList("a", "b", "c", "d","a","b");

    List<String> uniquestr=li.stream().distinct().collect(Collectors.toList());
    System.out.print(uniquestr);
}

}
