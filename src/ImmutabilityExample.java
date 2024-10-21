import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ImmutabilityExample {

    public static List<Integer> getSortedList(List<Integer> numbers) {
        List<Integer> copy = new ArrayList<>(numbers);
        Collections.sort(copy); // Create a new sorted list, leaving the original unchanged
        return copy;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        List<Integer> sortedNumbers = getSortedList(numbers);

        // Original list remains unchanged, only sortedNumbers is sorted
        System.out.println("Original: " + numbers);
        System.out.println("Sorted: " + sortedNumbers);
    }
}
