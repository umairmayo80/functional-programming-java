import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Predicate<Integer> evenNumberFilter = n -> n % 2 == 0;

        // Using functional programming style to filter even numbers and square them
        List<Integer> squaresOfEvenNumbers = numbers.stream()
                                                    .filter(evenNumberFilter) // Filters even numbers
                                                    .map(n -> n * n) // Squares the remaining numbers
                                                    .collect(Collectors.toList());

        // Output: Squares of even numbers: [4, 16]
        System.out.println("Squares of even numbers: " + squaresOfEvenNumbers);
    }
}
