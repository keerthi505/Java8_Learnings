package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemo {

    int[] array1= {0,1,2,3,4,5};
    //converting array to stream

    int sum1= Arrays.stream(array1).filter(n -> n%2 ==0).sum();

    //converting list into streams

    List<String> list1= Arrays.asList("hello","world");
    Stream<String> stream=list1.stream();

    //converting arrays into streams

    String[] ar={"keerthi","allam"};
    Stream<String> st= Arrays.stream(ar);

    //creating stream
    Stream<Integer> st1 =Stream.of(1,2,4);
    //infinite stream

   Stream<Integer> st6=Stream.iterate(0,x->x+1).limit(100);

   Stream<String> str=Stream.generate(()->"hello").limit(1000);
}
