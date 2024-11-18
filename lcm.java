import java.util.Scanner;
public class lcm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first niumber");
        int num1 = sc.nextInt();

        System.out.println("ENTER SECOND NUMBER");
        int num2= sc.nextInt();

        int lcm = findLCM(num1,num2);

           System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);


    }

    public static int findhcf(int a, int b){
        while(b != 0){
            int temp= b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int findLCM(int a, int b) {
        // LCM(a, b) = |a * b| / HCF(a, b)
        return (a * b) / findhcf(a, b);
    }
    
}
