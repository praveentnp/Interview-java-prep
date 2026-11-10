package jva8.features.mock;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Mock1 {
    public static void main(String arg[]) {
        List<Integer> numbers = List.of(-4, -5, -0, 0, 1, 2, 4);
        Predicate<Integer> predicate = s -> s > 0;
        Function<Integer, String> function = s -> "Number : " + s;

        numbers
                .stream()
                .filter(predicate)
                .map(function)
                .forEach(System.out::println);
    }
}
