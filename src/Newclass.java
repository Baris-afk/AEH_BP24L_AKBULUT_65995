import java.util.Scanner;

public class Newclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Main Menu ===");
            System.out.println("1) Sum of Squares");
            System.out.println("2) Simple Calculator");
            System.out.println("3) Exit");
            System.out.print("Choose an option: ");

            String option = scanner.next();

            switch (option) {
                case "1":
                    runSumOfSquares(scanner);
                    break;
                case "2":
                    runCalculator(scanner);
                    break;
                case "3":
                    System.out.println("Exiting program. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }

    public static void runSumOfSquares(Scanner scanner) {
        while (true) {
            System.out.print("\nEnter lower and upper integer limits: ");
            int lower = scanner.nextInt();
            int upper = scanner.nextInt();

            if (upper <= lower) {
                System.out.println("Done with sum of squares.");
                break;
            }

            int sum = 0;
            for (int i = lower; i <= upper; i++) {
                sum += i * i;
            }

            System.out.printf("The sums of the squares from %d to %d is %d%n", lower * lower, upper * upper, sum);
        }
    }

    public static void runCalculator(Scanner scanner) {
        String choice;

        do {
            System.out.println("\nCalculator Menu:");
            System.out.println("a) Add");
            System.out.println("b) Subtract");
            System.out.println("c) Multiply");
            System.out.println("d) Divide");
            System.out.println("e) Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.next().toLowerCase();

            if (choice.equals("e")) {
                break;
            }

            if (!choice.matches("[abcd]")) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            double num1 = getValidNumber(scanner, "Enter the first number: ");
            double num2 = getValidNumber(scanner, "Enter the second number: ");

            switch (choice) {
                case "a":
                    System.out.printf("Result: %.2f%n", num1 + num2);
                    break;
                case "b":
                    System.out.printf("Result: %.2f%n", num1 - num2);
                    break;
                case "c":
                    System.out.printf("Result: %.2f%n", num1 * num2);
                    break;
                case "d":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.printf("Result: %.2f%n", num1 / num2);
                    }
                    break;
            }
        } while (true);
    }

    public static double getValidNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("That's not a valid number. Try again.");
                scanner.next(); // clear invalid input
            }
        }
    }
}
