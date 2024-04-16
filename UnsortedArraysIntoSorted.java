package Streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class UnsortedArraysIntoSorted {
    public static void main(String[] args){
        int[] ar1={1,2,3};
        int[] ar2={8,9,7};

        int[] c=IntStream.concat(Arrays.stream(ar1),Arrays.stream(ar2)).sorted().toArray();
        System.out.println(Arrays.toString(c));
    }

}
