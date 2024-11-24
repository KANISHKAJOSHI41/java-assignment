import java.util.Scanner;

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class AgeInput {

    public static void checkAge(int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
