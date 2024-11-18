import java.util.Scanner;

public class COUNTDIGITS {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
      
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        int digitCount = countDigits(number);
        
        System.out.println("The number of digits in " + number + " is: " + digitCount);
        
    }

    public static int countDigits(int num) {

        if (num == 0) {
            return 1;
        }
        
        int count = 0;
        
        num = Math.abs(num);
        

        while (num > 0) {
            num = num / 10;  
            count++;         
        }
        
        return count;  
    }
}

