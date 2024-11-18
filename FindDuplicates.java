import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicates{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        
       
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
     
        Arrays.sort(numbers);
        
     
        boolean foundDuplicate = false;
        for (int i = 0; i < n - 1; i++) {
         
            if (numbers[i] == numbers[i + 1]) {
                int count = 1;  
                while (i + 1 < n && numbers[i] == numbers[i + 1]) {
                    count++;
                    i++;
                }
                System.out.println("Element: " + numbers[i] + " | Frequency: " + count);
                foundDuplicate = true;
            }
        }
        
        if (!foundDuplicate) {
            System.out.println("No duplicate elements found.");
        }
        
    }
}
