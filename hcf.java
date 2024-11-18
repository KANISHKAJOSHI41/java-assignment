import java.util.Scanner;
public class hcf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first niumber");
        int num1 = sc.nextInt();

        System.out.println("ENTER SECOND NUMBER");
        int num2= sc.nextInt();

        int hcf = findhcf(num1,num2);

           System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);


    }

    public static int findhcf(int a, int b){
        while(b != 0){
            int temp= b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    
}
