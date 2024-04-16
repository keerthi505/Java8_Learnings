package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinOfNumbers {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(112,34,5,6,7,78,9,10,11,12,13,14);

        Integer max = li.stream().max(Comparator.naturalOrder()).get();

        int min=li.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min + " "+max);
    }

}
