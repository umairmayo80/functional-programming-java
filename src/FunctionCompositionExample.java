import java.util.function.Function;

public class FunctionCompositionExample {

    //  Function composition is combining two or more functions to produce a new function.

    public static void main(String[] args) {
        Function<Integer, Integer> addTwo = (x) -> x + 2;
        Function<Integer, Integer> multiplyByThree = (x) -> x * 3;

        // Composed function: first adds 2, then multiplies by 3
        Function<Integer, Integer> addThenMultiply = addTwo.andThen(multiplyByThree);

        int result = addThenMultiply.apply(5); // (5 + 2) * 3 = 21

        // Output: Result: 21
        System.out.println("Result: " + result);
    }
}
