# Functional Programming in Java

## Introduction to Functional Programming (FP)

Functional programming (FP) is a programming paradigm that treats computation as the evaluation of mathematical functions and avoids changing state and mutable data. In FP, functions are first-class citizens, meaning they can be passed as arguments, returned from other functions, and assigned to variables.

Java has traditionally been an object-oriented programming (OOP) language. However, starting with Java 8, it introduced features that support functional programming, such as lambda expressions, streams, and functional interfaces. These features allow developers to write cleaner, more concise, and more declarative code.

---

## Key Concepts in Functional Programming

### 1. **Pure Functions**
   - **Definition**: A pure function is one that, given the same inputs, will always return the same output without producing any side effects (such as modifying global variables or performing I/O operations).
   - **Benefits**: Easier to reason about, test, and parallelize.
   - **Example**:
     ```java
     public int add(int a, int b) {
         return a + b;  // Always returns the same result for the same inputs.
     }
     ```

### 2. **Immutability**
   - **Definition**: In functional programming, once data is created, it cannot be changed. Functions that manipulate data return new versions rather than modifying the original.
   - **Benefits**: Reduces bugs related to shared state and makes the code more predictable.
   - **Example**:
     ```java
     public List<String> addName(List<String> names, String newName) {
         List<String> newNames = new ArrayList<>(names);
         newNames.add(newName);  // Returns a new list with the added name.
         return newNames;
     }
     ```

### 3. **First-Class Functions**
   - **Definition**: Functions in FP are treated as first-class citizens, meaning they can be assigned to variables, passed as arguments, or returned from other functions.
   - **Benefits**: Enables higher-order functions and more flexible design.
   - **Example**:
     ```java
     public static void main(String[] args) {
         Function<Integer, Integer> square = x -> x * x;  // Function assigned to a variable.
         System.out.println(square.apply(5));  // Output: 25
     }
     ```

### 4. **Higher-Order Functions**
   - **Definition**: A higher-order function is a function that takes other functions as arguments or returns functions as results.
   - **Benefits**: Increases modularity and reusability.
   - **Example**:
     ```java
     public static Function<Integer, Integer> multiplyBy(int multiplier) {
         return x -> x * multiplier;
     }
     public static void main(String[] args) {
         Function<Integer, Integer> multiplyByTwo = multiplyBy(2);
         System.out.println(multiplyByTwo.apply(5));  // Output: 10
     }
     ```

### 5. **Function Composition**
   - **Definition**: Function composition refers to combining simple functions to build more complex ones.
   - **Benefits**: Allows for better abstraction and reuse of smaller, simpler functions.
   - **Example**:
     ```java
     Function<Integer, Integer> square = x -> x * x;
     Function<Integer, Integer> addOne = x -> x + 1;
     Function<Integer, Integer> squareThenAddOne = square.andThen(addOne);
     System.out.println(squareThenAddOne.apply(4));  // Output: 17 (4 * 4 + 1)
     ```

### 6. **Declarative Code**
   - **Definition**: Declarative programming focuses on describing what needs to be done, rather than how it should be done (as opposed to imperative programming).
   - **Benefits**: More readable and less error-prone. Encourages thinking in terms of transformations rather than state changes.
   - **Example** (using Streams):
     ```java
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     List<Integer> squares = numbers.stream()
                                    .map(x -> x * x)
                                    .collect(Collectors.toList());
     // Output: [1, 4, 9, 16, 25]
     ```

### 7. **Recursion**
   - **Definition**: Recursion is the process of defining a function in terms of itself. It is often used in FP as an alternative to loops for iteration.
   - **Benefits**: Simpler and more elegant for certain problems like tree traversal and mathematical computations.
   - **Example**:
     ```java
     public int factorial(int n) {
         if (n == 0) {
             return 1;
         } else {
             return n * factorial(n - 1);
         }
     }
     ```

---

## Declarative Programming vs Imperative Programming

### **Declarative Programming**
   - **What**: Focuses on *what* the program should accomplish, rather than how to accomplish it.
   - **Features**: 
     - Emphasizes immutability and pure functions.
     - Code is more abstract and concise.
     - Common in functional programming.
   - **Example**:
     ```java
     List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
     List<String> filteredNames = names.stream()
                                       .filter(name -> name.startsWith("A"))
                                       .collect(Collectors.toList());
     ```

### **Imperative Programming**
   - **What**: Focuses on *how* the program should achieve its goal, with explicit instructions for each step.
   - **Features**: 
     - Emphasizes changing state with loops and conditionals.
     - Code can be more verbose and harder to maintain.
     - Common in object-oriented and procedural programming.
   - **Example**:
     ```java
     List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
     List<String> filteredNames = new ArrayList<>();
     for (String name : names) {
         if (name.startsWith("A")) {
             filteredNames.add(name);
         }
     }
     ```

---

## Functional Programming in Java

Although Java is primarily an object-oriented language, it provides features that support functional programming concepts, such as:
- **Lambda Expressions**: Enables writing anonymous functions in a concise manner.
- **Stream API**: Allows operations on collections of data in a functional style.
- **Method References**: Simplifies calling methods using shorthand notation.
- **Functional Interfaces**: Java provides several built-in functional interfaces like `Function`, `Predicate`, and `Consumer`.

---

## Why Use Functional Programming?

- **Readability**: Functional code is often more concise and easier to understand because it focuses on *what* should be done rather than *how* to do it.
- **Modularity**: Functions are self-contained and can be easily reused or combined.
- **Predictability**: Pure functions and immutability lead to more predictable behavior, making debugging and testing easier.
- **Parallelism**: Functional code, especially with immutability, is easier to parallelize because there’s no shared mutable state.

---

### References

- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [Functional Programming in Java - Baeldung](https://www.baeldung.com/java-functional-programming)

---

This `Repository` provides a clear introduction to the key concepts of functional programming, especially as they relate to Java, with code examples and a comparison of declarative programming vs. imperative programming approaches.