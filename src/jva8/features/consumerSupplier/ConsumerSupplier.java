package jva8.features.consumerSupplier;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSupplier {
    public static void main(String arg[]) {
        Consumer<String> printer = text -> System.out.println(text);

        printer.accept("Hello!"); // Prints: Hello!

        Supplier<String> greeting = () -> "Hello!";

        System.out.println(greeting.get()); // Prints: Hello!


    }
}
