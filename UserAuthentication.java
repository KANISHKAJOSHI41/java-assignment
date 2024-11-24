import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class UserAuthentication {

    private static final String predefinedPassword = "secure123";

    public static void validateUser(String username, String password) throws InvalidUsernameException, PasswordMismatchException {
        if (username.length() < 6) {
            throw new InvalidUsernameException("Username must be at least 6 characters long.");
        }

        if (!password.equals(predefinedPassword)) {
            throw new PasswordMismatchException("Password does not match.");
        }

        System.out.println("User authenticated successfully.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            validateUser(username, password);
        } catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        } catch (PasswordMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
