import java.util.Scanner;

public class avgandsum {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3,4,5};
        int x;
        int length=a.length;
        Scanner sc = new Scanner(System.in);
       
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
       double avr = sum/length;
       x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println(sum);

                break;
            case 2:
                System.out.println(avr);
                break;

            default:
                System.out.println("invalid");
                break;
        }
    }
}