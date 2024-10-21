import java.util.function.Function;

public class HigherOrderFunctionExample {

    // Higher-order function that takes a function as a parameter
    public static int applyFunction(int x, Function<Integer, Integer> func) {
        return func.apply(x);
    }

    public static void main(String[] args) {

//        Function<InputType, OutPutType> name = function body;
        Function<Integer, Integer> square = (n) -> n * n; // Function to square a number
        Function<Integer, Integer> cube = (n) -> n * n * n; // Function to cube a number

        int squared = applyFunction(5, square);
        int cubed = applyFunction(3, cube);

        // Outputs: 5 squared: 25, 3 cubed: 27
        System.out.println("5 squared: " + squared + ", 3 cubed: " + cubed);
    }
}
