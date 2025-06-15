import java.io.*;
import java.util.*;

public class myThirteenthApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFilePath;
        String outputFilePath;

        // Loop until a valid input file is provided
        File inputFile;
        while (true) {
            System.out.print("Enter the path of the input text file: ");
            inputFilePath = scanner.nextLine();
            inputFile = new File(inputFilePath);

            if (inputFile.exists() && inputFile.isFile()) {
                break; // Valid file found
            } else {
                System.out.println("The file does not exist. Please enter a valid file path.");
            }
        }

        // Get the output file path
        System.out.print("Enter the path of the output file: ");
        outputFilePath = scanner.nextLine();

        // Word counter and frequency map
        int totalWordCount = 0;
        Map<String, Integer> wordFrequencies = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;

            // Read input file line by line
            while ((line = reader.readLine()) != null) {
                // Remove punctuation and convert to lowercase
                line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        totalWordCount++;
                        wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Display results to console
            System.out.println("\n=== Analysis Result ===");
            System.out.println("File name: " + inputFile.getName());
            System.out.println("Total number of words: " + totalWordCount);
            System.out.println("\nWord frequencies:");
            for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Write results to output file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
                writer.write("File name: " + inputFile.getName() + "\n");
                writer.write("Total number of words: " + totalWordCount + "\n\n");
                writer.write("Word frequencies:\n");
                for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
                    writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
                }
            }

            System.out.println("\nResults have been saved to: " + outputFilePath);

        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing files: " + e.getMessage());
        }

        scanner.close();
    }
}
