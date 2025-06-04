import java.io.*;
import java.util.Scanner;

public class myTwelfthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPath;
        File inputFile;

        // Ask for a valid input file path
        while (true) {
            System.out.print("Enter the path to the input text file: ");
            inputPath = scanner.nextLine();
            inputFile = new File(inputPath);

            if (inputFile.exists() && inputFile.isFile()) {
                break;
            } else {
                System.out.println("File does not exist. Please try again.");
            }
        }

        // Ask for output file path
        System.out.print("Enter the path to the output text file: ");
        String outputPath = scanner.nextLine();

        int lineCount = 0;

        // Count lines in the input file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Number of lines in the file: " + lineCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            return;
        }

        // Write result to the output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            writer.write("Input file: " + inputFile.getName());
            writer.newLine();
            writer.write("Number of lines: " + lineCount);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
