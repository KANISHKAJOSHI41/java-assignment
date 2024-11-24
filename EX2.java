public class EX2    {

    public static void main(String[] args) {
        // Handling NegativeArraySizeException
        try {
            int size = -5;  
            int[] arr = new int[size];  
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }

        // Handling ArithmeticException
        try {
            int num = 10;
            int divisor = 0; 
            int result = num / divisor;  
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
