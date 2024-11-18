import java.util.Scanner;

public class multipleof10 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input the start and end of the interval
        System.out.print("Enter the start of the interval: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the end of the interval: ");
        int end = scanner.nextInt();

        // Print all multiples of 10 between start and end
        System.out.println("Multiples of 10 between " + start + " and " + end + " are:");

        // Find the first multiple of 10 greater than or equal to 'start'
        int multiple = (start % 10 == 0) ? start : (start + (10 - start % 10));

        // Loop to print multiples of 10 between start and end
        for (int i = multiple; i <= end; i += 10) {
            System.out.println(i);
        }

        // Close the scanner
        scanner.close();
    }
}
