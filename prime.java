public class prime {
    public static void main(String[] args) {
        int k = 7;
        int a = 0;
        for (int i = 2; i < k; i++) {
            if (k % i == 0) {
                a++;
            }
        }
        if (a == 0) {
            System.out.println("The no. is prime");
        }
    }
}
