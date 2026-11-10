package jva8.features.defaultmethod;

public interface Greeting {
    default void sayHello() {
        System.out.println("Hello!");
    }
}
