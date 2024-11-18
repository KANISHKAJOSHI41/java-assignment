import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input: Prompt the user to enter three numbers
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the maximum of the three numbers
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        // Output the result
        System.out.println("The maximum of the three numbers is: " + max);

        // Close the scanner
        scanner.close();
    }
}

