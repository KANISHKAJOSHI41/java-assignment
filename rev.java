import java.util.Scanner;

class rev{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");

        int num= sc.nextInt();

        int r=0;

        while(num!=0){
            int digit = num%10;
            r=r*10+digit;

            num/=10;

        }

        System.out.println("reversed number:"+ r);
        
    }
}