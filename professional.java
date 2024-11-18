import java.util.Scanner;
public class professional {

    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Loop over each student to process their marks
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks for student " + i + ":");
            
            // Input marks for Maths, Physics, and Chemistry
            System.out.print("Maths: ");
            int mathsMarks = scanner.nextInt();
            
            System.out.print("Physics: ");
            int physicsMarks = scanner.nextInt();
            
            System.out.print("Chemistry: ");
            int chemistryMarks = scanner.nextInt();
            
            // Calculate total marks
            int totalMarks = mathsMarks + physicsMarks + chemistryMarks;

            // Check eligibility
            if (totalMarks >= 150) {
                System.out.println("Student " + i + " is eligible with total marks: " + totalMarks);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
