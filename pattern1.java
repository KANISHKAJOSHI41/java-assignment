public class pattern1 {
    public static void main(String[] args) {
        int rows = 3; // Number of rows for the pattern
        int number = 1; // The starting number
        
        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Loop through each column in the current row
            for (int j = 1; j <= 2 * i - 1; j++) {
                // Print the current number and increment it
                System.out.print(number + " ");
                number++; // Increment the number for next print
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
