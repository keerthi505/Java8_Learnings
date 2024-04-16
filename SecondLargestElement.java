package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestElement {
public static void main(String[] args){
    List<Integer> li = Arrays.asList(11,2,34,56,78);
    Integer second=li.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    System.out.println(second);
}


}
