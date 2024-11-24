public class ArithmeticWithCustomException {

    static class CustomArithmeticException extends Exception {
        public CustomArithmeticException(String message) {
            super(message);
        }
    }

    public static double calculate(String equation) throws CustomArithmeticException {
       
        String[] tokens = equation.split(" ");
        if (tokens.length != 3) {
            throw new IllegalArgumentException("Equation format must be: operand operator operand");
        }

        double operand1 = Double.parseDouble(tokens[0]);
        String operator = tokens[1];
        double operand2 = Double.parseDouble(tokens[2]);
        
        double result = 0;
        
        try {
            switch (operator) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 == 0) {
                        throw new CustomArithmeticException("Division by zero is not allowed!");
                    }
                    result = operand1 / operand2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator. Only +, -, *, / are allowed.");
            }
        } catch (ArithmeticException e) {
            throw new CustomArithmeticException("An arithmetic error occurred: " + e.getMessage());
        }

        return result;
    }

    public static void main(String[] args) {
        // Test equations
        String[] equations = {
            "10 / 2",  
            "5 / 0",    
            "9999999999999999 + 9999999999999999", 
            
            "100 * 2"  
        };

        for (String eq : equations) {
            try {
                double result = calculate(eq);
                System.out.println("Result of " + eq + " = " + result);
            } catch (CustomArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }
}
