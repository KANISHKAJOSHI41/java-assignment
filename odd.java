public class odd {
    public static void main(String[] args) {
        int n = 65;
        if (n % 2 == 0) {
            System.out.println("The number is even");

        } else {
            System.out.println("The number is odd");
        }
        int m = 5;
        int a = 0;
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                a++;
            }
        }
    }
}