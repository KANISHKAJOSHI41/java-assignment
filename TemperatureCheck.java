import java.util.Scanner;

class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class TemperatureCheck {

    // Method to check temperature and throw exceptions if necessary
    public static void checkTemperature(double tempCelsius) throws TooHot, TooCold {
        if (tempCelsius > 35) {
            throw new TooHot("Temperature is too hot!");
        } else if (tempCelsius < 5) {
            throw new TooCold("Temperature is too cold!");
        } else {
            double fahrenheit = (tempCelsius * 9 / 5) + 32;
            System.out.println("Temperature is Normal. " + tempCelsius + "°C is " + fahrenheit + "°F.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the temperature in Celsius: ");
        double temp = scanner.nextDouble();

        try {
            checkTemperature(temp);
        } catch (TooHot e) {
            System.out.println(e.getMessage());
        } catch (TooCold e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
