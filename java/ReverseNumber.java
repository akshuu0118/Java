import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int reversedNumber = reverse(number);
        
        System.out.println("Reversed number: " + reversedNumber);
        
        scanner.close();
    }

    public static int reverse(int number) {
        int reversed = 0;
        
        while (number != 0) {
            int digit = number % 10;          // Get the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            number /= 10;                     // Remove the last digit from the original number
        }
        
        return reversed;
    }
}
