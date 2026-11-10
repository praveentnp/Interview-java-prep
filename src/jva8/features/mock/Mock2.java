package jva8.features.mock;

import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Mock2 {
    public static void main(String[] args) {
        Supplier<List<String>> supplier = () -> List.of("ava", "li", "noah", "mia");
        Predicate<String> predicate = p -> p.length() > 2;
        Function<String, String> function = f -> f.substring(0,1).toUpperCase(Locale.ROOT) + f.substring(1) ;
        Consumer<String> consumer = c -> System.out.println("Name: " + c);

        supplier.get()
                .stream()
                .filter(predicate)
                .map(function)
                .forEach(consumer);
    }
}
