package temp;

import java.util.Scanner;

public class TemperatureConverter {
	
	 //  Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    //  Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    //  Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    //  Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    //  Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    //  Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value:");
        double temp = scanner.nextDouble();

        System.out.println("Enter the original unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin):");
        char unit = scanner.next().toUpperCase().charAt(0);

        switch (unit) {
            case 'C':
                System.out.println(temp + " Celsius is equivalent to:");
                System.out.println(celsiusToFahrenheit(temp) + " Fahrenheit");
                System.out.println(celsiusToKelvin(temp) + " Kelvin");
                break;

            case 'F':
                System.out.println(temp + " Fahrenheit is equivalent to:");
                System.out.println(fahrenheitToCelsius(temp) + " Celsius");
                System.out.println(fahrenheitToKelvin(temp) + " Kelvin");
                break;

            case 'K':
                System.out.println(temp + " Kelvin is equivalent to:");
                System.out.println(kelvinToCelsius(temp) + " Celsius");
                System.out.println(kelvinToFahrenheit(temp) + " Fahrenheit");
                break;

            default:
                System.out.println("Invalid unit of measurement. Please enter C, F, or K.");
                break;
        }

        scanner.close();
    }

}
