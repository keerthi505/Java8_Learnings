package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {
public static void main(String[] args) {
    List<String> names= Arrays.asList("keerthi","allam");
    Map<String,Long> map=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    System.out.print(map);
}

}
