package jva8.features.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String arg[]) {
        Function<String, String> toUppercase =text -> text.toUpperCase();

        String result = toUppercase.apply("hello");
        System.out.println(result); // HELLO


        Function<String, Integer> length = text -> text.length();
        Function<Integer, Integer> doubleIt = number -> number * 2;

        Function<String, Integer> lengthThenDouble = length.andThen(doubleIt);

        System.out.println(lengthThenDouble.apply("Java")); // 8


    }
}
