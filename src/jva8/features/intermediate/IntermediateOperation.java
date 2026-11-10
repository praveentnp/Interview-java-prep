package jva8.features.intermediate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntermediateOperation {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8, 10);

        // findFirst(): returns the first matching element in encounter order
        int firstOverFive = numbers.stream()
                .filter(n -> n > 5)
                .findFirst()
                .orElse(-1);
        System.out.println(firstOverFive); // 6

        // findAny(): returns any matching element
        // With a sequential stream, this commonly returns the first match.
        int anyOverFive = numbers.stream()
                .filter(n -> n > 5)
                .findAny()
                .orElse(-1);
        System.out.println(anyOverFive); // 6

        // anyMatch(): true if at least one element matches
        boolean hasNumberOverEight = numbers.stream()
                .anyMatch(n -> n > 8);
        System.out.println(hasNumberOverEight); // true

        // allMatch(): true if every element matches
        boolean allAreEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);
        System.out.println(allAreEven); // true

        // noneMatch(): true if no element matches
        boolean noneAreNegative = numbers.stream()
                .noneMatch(n -> n < 0);
        System.out.println(noneAreNegative); // true

        // reduce(): combines elements into one result
        int sum = numbers.stream()
                .reduce(0, (total, n) -> total + n);
        System.out.println(sum); // 30

        // collect(): gathers stream elements into a collection
        List<Integer> doubled = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(doubled); // [4, 8, 12, 16, 20]

        // groupingBy(): groups elements according to a classifier
        Map<Boolean, List<Integer>> groupedByEven =
                numbers.stream()
                        .collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println(groupedByEven);
        // {true=[2, 4, 6, 8, 10]}

        // peek(): observes elements as they pass through the stream
        List<Integer> result = numbers.stream()
                .filter(n -> n > 5)
                .peek(n -> System.out.println("Passing filter: " + n))
                .map(n -> n * 10)
                .toList();
        System.out.println(result); // [60, 80, 100]
    }
}
