public class mySixthApp {

    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int number = 20;

        long startTimeIterative = System.nanoTime();
        long resultIterative = factorialIterative(number);
        long endTimeIterative = System.nanoTime();
        System.out.println("Iterative Result: " + resultIterative);
        System.out.println("Time Taken (Iterative): " + (endTimeIterative - startTimeIterative) + " ns");

        long startTimeRecursive = System.nanoTime();
        long resultRecursive = factorialRecursive(number);
        long endTimeRecursive = System.nanoTime();
        System.out.println("Recursive Result: " + resultRecursive);
        System.out.println("Time Taken (Recursive): " + (endTimeRecursive - startTimeRecursive) + " ns");
    }
}
