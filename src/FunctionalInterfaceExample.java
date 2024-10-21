public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        // Using a lambda with a custom functional interface
        // The GreetingService interface is a functional interface.
        // The lambda expression (name) -> "Hello, " + name + "!" implements the greet method.
        GreetingService greetService = (name) -> "Hello, " + name + "!";
        String greeting = greetService.greet("Umair");

        // Output: Hello, Umair!
        System.out.println(greeting);
    }
}


// A functional interface is an interface with a single abstract method.
// Java provides several built-in functional interfaces (like Function, Predicate, etc.), but you can also create your own.
// Functional interface with a single abstract method
@FunctionalInterface
interface GreetingService {
    String greet(String name);
}
