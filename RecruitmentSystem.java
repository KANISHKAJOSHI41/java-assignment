import java.util.Scanner;

class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}


class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class RecruitmentSystem {

    public static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("Age is too old for recruitment.");
        } else if (age < 20) {
            throw new TooYounger("Age is too young for recruitment.");
        } else {
            System.out.println("Eligible: " + name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the candidate's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the candidate's age: ");
        int age = scanner.nextInt();

        try {
            checkEligibility(name, age);
        } catch (TooOlder e) {
            System.out.println(e.getMessage());
        } catch (TooYounger e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
