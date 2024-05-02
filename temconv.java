
import java.util.Scanner;

public class temconv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1-6): ");

        int choice = scanner.nextInt();
        double temperature;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
                break;
            case 2:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Kelvin: " + celsiusToKelvin(temperature));
                break;
            case 3:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
                break;
            case 4:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Kelvin: " + fahrenheitToKelvin(temperature));
                break;
            case 5:
                System.out.print("Enter temperature in Kelvin: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Celsius: " + kelvinToCelsius(temperature));
                break;
            case 6:
                System.out.print("Enter temperature in Kelvin: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperature in Fahrenheit: " + kelvinToFahrenheit(temperature));
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
}
