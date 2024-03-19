package pl.pp;
import java.util.Scanner;

public class myThirdApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a program to execute:");
        System.out.println("1. Convert days into weeks and days");
        System.out.println("2. Convert Celsius to Fahrenheit and Kelvin");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                convertDaysToWeeksAndDays(scanner);
                break;
            case 2:
                convertCelsiusToFahrenheitAndKelvin(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private static void convertDaysToWeeksAndDays(Scanner scanner) {
        System.out.println("Enter the number of days (enter a non-positive value to exit):");
        int days = scanner.nextInt();

        while (days > 0) {
            int weeks = days / 7;
            int remainingDays = days % 7;

            System.out.println(days + " days is " + weeks + " weeks and " + remainingDays + " days.");

            System.out.println("Enter the number of days (enter a non-positive value to exit):");
            days = scanner.nextInt();
        }

        System.out.println("Program terminated.");
    }

    private static void convertCelsiusToFahrenheitAndKelvin(Scanner scanner) {
        System.out.println("Enter the temperature in Celsius (enter -1 to exit):");
        double celsius = scanner.nextDouble();

        while (celsius != -1) {
            double fahrenheit = 1.8 * celsius + 32.0;
            double kelvin = celsius + 273.16;

            System.out.printf("%.2f Celsius is %.2f Fahrenheit and %.2f Kelvin.%n", celsius, fahrenheit, kelvin);

            System.out.println("Enter the temperature in Celsius (enter -1 to exit):");
            celsius = scanner.nextDouble();
        }

        System.out.println("Program terminated.");
    }
}
