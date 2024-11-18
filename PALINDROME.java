import java.util.Scanner;
public class PALINDROME {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("enter an integer:");
        int num=sc.nextInt();

        int org= num;
        int revnumber= 0;

        if (num< 0) {
            System.out.println(num + " is not a palindrome.");
        } else {
            // Reverse the number
            while (num != 0) {
                int lastDigit = num % 10;
                revnumber = revnumber * 10 + lastDigit;
        }
}
if (org == revnumber) {
    System.out.println(org + " is a palindrome.");
}
 else {
    System.out.println(org + " is not a palindrome.");
       }
    }
}
