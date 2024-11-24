import java.util.HashMap;
import java.util.Map;

public class CountryCapital {

    // Custom exception
    static class NoMatchFoundException extends Exception {
        public NoMatchFoundException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a country name as a command-line argument.");
            return;
        }

        String country = args[0];

        
        Map<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("Germany", "Berlin");
        countryCapitals.put("Canada", "Ottawa");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("Brazil", "Brasília");

        try {
            
            if (!countryCapitals.containsKey(country)) {
                throw new NoMatchFoundException("No capital found for the country: " + country);
            }

           
            String capital = countryCapitals.get(country);
            System.out.println("The capital of " + country + " is " + capital + ".");
        } catch (NoMatchFoundException e) {
          
            System.out.println(e.getMessage());
        }
    }
}
