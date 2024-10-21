public class PureFunctionExample {

    // Pure function: always returns the same output for the same inputs.
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result1 = add(2, 3);
        int result2 = add(2, 3);

        // Outputs: Result 1: 5, Result 2: 5
        System.out.println("Result 1: " + result1 + ", Result 2: " + result2);
    }
}
