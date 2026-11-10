package jva8.features.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> isEven = integer -> integer % 2 == 0;
        Predicate<Integer> isPostive = integer -> integer > 0;
        Predicate<Integer> isNegative = integer -> integer < 0;


        System.out.println(isEven.and(isPostive).test(8));

    }
}
