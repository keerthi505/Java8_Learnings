package Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigits {
public static void main(String[] args) {
    int num=12345;

    int sum1= Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
    System.out.println(sum1);
}

}
