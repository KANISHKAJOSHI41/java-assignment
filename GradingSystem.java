import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input: Prompt the user to enter the total marks and the obtained marks
        System.out.println("Enter the total marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.println("Enter the obtained marks: ");
        double obtainedMarks = scanner.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;

        
        System.out.println("Percentage: " + percentage + "%");

        // Determine the grade based on the percentage
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

      
    }
}
