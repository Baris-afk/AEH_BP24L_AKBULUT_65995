public class myFifthApp {

    public static void main(String[] args) {
        // Call the method with example values
        // This will print the character '*' 5 times in a row, for 3 lines
        printCharacterGrid('*', 5, 3);
    }

    // This method prints a grid of characters
    // Parameters:
    // - ch: the character to print
    // - countPerLine: how many times to print the character in one row
    // - numberOfLines: how many rows to print
    public static void printCharacterGrid(char ch, int countPerLine, int numberOfLines) {

        // Outer loop controls the number of lines (rows)
        for (int i = 0; i < numberOfLines; i++) {

            // Inner loop prints the character multiple times in one line
            for (int j = 0; j < countPerLine; j++) {
                System.out.print(ch); // print character without new line
            }

            // After one full line is printed, move to the next line
            System.out.println();
        }
    }
}
