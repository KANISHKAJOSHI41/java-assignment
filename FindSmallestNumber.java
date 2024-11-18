import java.util.Scanner;

public class FindSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
    
        int[] numbers = new int[n];
    
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
      
        int smallest = numbers[0];  
        for (int i = 1; i < n; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];  
            }
        }
        
        System.out.println("The smallest number is: " + smallest);
        
       
    }
}
