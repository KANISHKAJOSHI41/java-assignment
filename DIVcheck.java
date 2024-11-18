import java.util.Scanner;

public class DIVcheck {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to be checked: ");
        int number = scanner.nextInt();

        System.out.println("Enter the number to divide by: ");
        int divisor = scanner.nextInt();

        // Check if the divisor is zero to avoid division by zero error
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Check if the number is divisible by the divisor
            if (number % divisor == 0) {
                System.out.println(number + " is divisible by " + divisor);
            } else {
                System.out.println(number + " is not divisible by " + divisor);
            }
        }

        
    }
}

