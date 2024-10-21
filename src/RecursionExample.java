public class RecursionExample {

    // A function calls itself to solve smaller instances of the same problem.
    // Recursive function to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(5); // 5! = 5 * 4 * 3 * 2 * 1 = 120

        // Output: Factorial of 5: 120
        System.out.println("Factorial of 5: " + result);
    }
}
