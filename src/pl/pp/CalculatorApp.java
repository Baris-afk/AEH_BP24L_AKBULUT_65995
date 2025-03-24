package pl.pp;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        // Task 1: Create an integer variable x, assign 10, and display its double and square
        int x = 10;
        int doubleX = x * 2;
        int squareX = x * x;

        System.out.println("x = " + x);
        System.out.println("Double of x = " + doubleX);
        System.out.println("Square of x = " + squareX);

        // Task 2: Ask for user's age and convert it to seconds
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age in years: ");
        int ageInYears = scanner.nextInt();

        long ageInSeconds = (long) ageInYears * 365 * 24 * 60 * 60;
        System.out.println("My age in seconds: " + ageInSeconds);

        scanner.close();
    }
}
