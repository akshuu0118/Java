import java.util.Scanner;

public class StringCharacterCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        
        int vowelsCount = 0;
        int consonantsCount = 0;
        int digitsCount = 0;
        int spacesCount = 0;

 
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitsCount++;
            } else if (Character.isSpaceChar(ch)) {
                spacesCount++;
            } else if (isVowel(ch)) {
                vowelsCount++;
            } else if (Character.isLetter(ch)) {
                consonantsCount++;
            }
        }


        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Consonants: " + consonantsCount);
        System.out.println("Digits: " + digitsCount);
        System.out.println("Spaces: " + spacesCount);
    }


    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
