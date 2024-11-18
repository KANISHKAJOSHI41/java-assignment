import java.util.Scanner;

public class SumofOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
      
        int[] numbers = new int[n];
        
    
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 != 0) {  
                sum += numbers[i];  
            }
        }
        
        System.out.println("The sum of all odd numbers in the array is: " + sum);
        
    }
}
