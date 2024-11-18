import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms in the Fibonacci series: ");
        int terms = scanner.nextInt();

        
        if (terms <= 0) {
            System.out.println(" enter a positive integer.");
        } else {
      
            System.out.println("Fibonacci Series up to " + terms + " terms:");

            
            int num1 = 0, num2 = 1;

            
            for (int i = 1; i <= terms; i++) {
                System.out.print(num1 + " ");

                // Calculate the next term by adding the previous two terms
                int nextTerm = num1 + num2;
                num1 = num2;
                num2 = nextTerm;
            }
        }

        
    }
}
