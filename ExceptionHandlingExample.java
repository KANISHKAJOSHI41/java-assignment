import java.io.*;

public class ExceptionHandlingExample {


    public static void methodThatThrowsException() throws IOException {
       
        throw new IOException("This is an IO exception.");
    }

    public static void main(String[] args) {
     
        try {
         
            int result = 10 / 0;  
            System.out.println("Result: " + result);

            methodThatThrowsException();
        }
       
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        
        catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
       
        
        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        
        finally {
            System.out.println("Finally block executed: This block runs regardless of an exception.");
        }

    
        try {
           
            methodThatThrowsException();
        }
        catch (IOException e) {
            System.out.println("Caught IOException from methodThatThrowsException: " + e.getMessage());
        }
    }
}
