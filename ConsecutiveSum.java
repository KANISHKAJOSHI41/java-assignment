public class ConsecutiveSum {
    public static void main(String[] args) {
        String input = "2415";
        int sum = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            String pair = input.substring(i, i + 2);
            sum += Integer.parseInt(pair);
        }

        System.out.println("Sum of consecutive pairs: " + sum);
    }
}
