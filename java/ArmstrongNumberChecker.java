import java.util.Scanner;

public class ArmstrongNumberChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Static method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        // Convert the number to a string to determine the number of digits
        String numberStr = Integer.toString(number);
        int numDigits = numberStr.length();
        int sum = 0;
        int temp = number;

        // Calculate the sum of each digit raised to the power of numDigits
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == number;
    }
}

    

