import java.util.Scanner;

public class AlternateCharacters {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Display alternate characters
        displayAlternateCharacters(input);
    }

    // Method to display alternate characters from the given string
    public static void displayAlternateCharacters(String str) {
        // Iterate through the string and print alternate characters
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println(); // Move to the next line after printing
    }
}
