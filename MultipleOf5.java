package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOf5 {
    public static void main(String[] args){
        List<Integer> li= Arrays.asList(1,2,3,4,5);
       List<Integer>newList= li.stream().filter(n->n%5==0).collect(Collectors.toList());
        System.out.println(newList);
    }
}
