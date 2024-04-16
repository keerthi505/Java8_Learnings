package Streams;

import java.util.Arrays;
import java.util.List;

public class LastElementOfArray {
public static void main(String[] args) {
    List<String> li = Arrays.asList("keerthi","allam");

    String str=li.stream().skip(li.size()- 1).findFirst().get();
    System.out.println(str);

}





}
