package PredicateExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    //predicate is a functional interface and it has boolean valued function test

    //and other default and static methods like negate, or etc

    public static void main(String[] args){
        Predicate<Integer> salarygreater = (x)-> x>1000;//it holds the condition
        System.out.println(salarygreater.test(10000));
        //--------------

        Predicate<Integer> isEven=(n)-> n%2==0;
        List<Integer> numbers= new ArrayList<>();
        numbers.add(2);
        numbers.add(9);
        numbers.add(98);
        System.out.println(numbers);
        for(Integer i : numbers){
            if(isEven.test(i)){
                System.out.println("even number present "+i);
            }
        }

        //---------

        Predicate<String> startsWithLetterK = (s)->s.toLowerCase().charAt(0) == 'k';
        Predicate<String> endsWithLetterI = (s)->s.toLowerCase().charAt(s.length()-1) == 'i';
        System.out.println(startsWithLetterK.test("Keerthi"));
        System.out.println(startsWithLetterK.test("Mohansai"));
        Predicate<String> and=startsWithLetterK.and(startsWithLetterK);
        System.out.println(and.test("Keerthi Rajulapati"));

        Predicate<String> or=startsWithLetterK.or(endsWithLetterI);//and method in predicate
        //-----------------
        System.out.println(startsWithLetterK.negate().test("keerthi"));

        //------
        Predicate <Object> predicate = Predicate.isEqual(2);
        System.out.println(predicate.test(4));

    }
    
}
