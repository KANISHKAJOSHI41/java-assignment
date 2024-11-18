import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 to convert Binary to Decimal or 2 for Decimal to Binary: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
        
            System.out.print("Enter a binary number: ");
            String binary = scanner.next();
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("Decimal equivalent: " + decimal);
        } else if (choice == 2) {
            
            System.out.print("Enter a decimal number: ");
            int decimal = scanner.nextInt();
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Binary equivalent: " + binary);
        } else {
            System.out.println("Invalid choice");
        }

    }
}
