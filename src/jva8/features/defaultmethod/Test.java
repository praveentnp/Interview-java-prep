package jva8.features.defaultmethod;

public class Test {
    public static void main(String[] args) {
        new FriendlyGreeting().sayHello(); // Hello!
        new FormalGreeting().sayHello();   // Good day.
    }
}
