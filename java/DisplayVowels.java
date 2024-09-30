import java.util.Scanner;

public class DisplayVowels {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Call the method to display vowels
        displayVowels(input);
    }

    // Method to display vowels from the given string
    public static void displayVowels(String str) {
        // Define a string containing all vowels
        String vowels = "aeiou";

        // StringBuilder to collect vowels found
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel (consider case insensitivity)
            if (vowels.indexOf(Character.toLowerCase(ch)) != -1) {
                result.append(ch);
                result.append(" ");
            }
        }

        // Display the vowels found
        if (result.length() > 0) {
            System.out.println("Vowels in the string: " + result.toString().trim());
        } else {
            System.out.println("No vowels found in the string.");
        }
    }
}
