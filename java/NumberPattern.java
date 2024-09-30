public class NumberPattern {

    public static void main(String[] args) {
        // Number of rows in the pattern
        int rows = 5;

        // Generate and display the pattern
        for (int i = 0; i < rows; i++) {
            // Generate each line of the pattern
            for (int j = rows - i; j <= rows; j++) {
                System.out.print(j);
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
