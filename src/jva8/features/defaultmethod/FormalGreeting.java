package jva8.features.defaultmethod;

public class FormalGreeting implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("Good day.");
    }
}