package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo2 {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> filteredlist=list.stream().filter(n->n%2==0).map(n->n/2).distinct().sorted((a,b)->(b-a)).limit(4).skip(1).collect(Collectors.toList());
        System.out.println(filteredlist);

    }

}
