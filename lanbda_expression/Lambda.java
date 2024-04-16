package lanbda_expression;

public class Lambda{
    public static void main(String[] args) {
//we use lambda function with fi so we can call methods of fi
        FI f = () -> "keerthi";
        System.out.println(f.say());
//without using the different implentation class we can use lambda exp - advantage
        FI of = () -> "mohansai";
        System.out.println(of.say());
    }
}
