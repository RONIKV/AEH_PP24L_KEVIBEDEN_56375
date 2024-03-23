package pl.pp;
import java.util.Scanner;
public class myFourthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Calculator!");
            System.out.println("Please select the operation you want to perform:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exiting the Calculator...");
                break;
            }

            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            double result = 0;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero.");
                        break;
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }
            System.out.println("Result: " + result);
            System.out.println("Press Enter to continue...");
            scanner.nextLine();
            scanner.nextLine();
        }
        scanner.close();
    }
}

