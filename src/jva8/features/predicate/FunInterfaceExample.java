package jva8.features.predicate;

public class FunInterfaceExample {

    public static void main(String[] args) {
        Greeting greeting = name -> System.out.println("hello-->" + name);

        greeting.sayHello("Maya");
    }
}
