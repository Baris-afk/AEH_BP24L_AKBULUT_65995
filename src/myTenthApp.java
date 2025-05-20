public class myTenthApp {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
        int[] result = countAndSumElements(input);

        // Print the result
        if (result.length == 0) {
            System.out.println("Empty array.");
        } else {
            System.out.println("Number of negative elements: " + result[0]);
            System.out.println("Sum of positive elements: " + result[1]);
        }
    }

    public static int[] countAndSumElements(int[] input) {
        // Check if the input array is null or empty
        if (input == null || input.length == 0) {
            return new int[0]; // return an empty array
        }

        int negativeCount = 0;
        int positiveSum = 0;

        // Loop through each number in the array
        for (int number : input) {
            if (number < 0) {
                negativeCount++;
            } else if (number > 0) {
                positiveSum += number;
            }
        }

        // Return the result as a new array
        return new int[] {negativeCount, positiveSum};
    }
}
