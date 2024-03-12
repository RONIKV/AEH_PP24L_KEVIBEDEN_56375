package pl.pp;

import java.util.Scanner;

public class mySecondApp {
    public static void main(String[] args) {
        double x = 10; //creating a double type variable and assigning it a value of 10
        double y = 2; // Define y here

        Scanner scanner = new Scanner(System.in);

        var result = x + y;
        System.out.println("x + y = " + result);

        result = x -y;
        System.out.println("x -y = " + result);

        result = x * y;
        System.out.println("x * y = " + result);

        result = x / y;
        System.out.println("x / y = " + result);

        result = x % y;
        System.out.println("x % y = " + result);

        System.out.println("Entertwo numbers separated by the Enter key:");
        double first = scanner.nextDouble();//reguest to enter a double value
        double second = scanner.nextDouble();
        System.out.println("x + y = " + (first + second));

        scanner.nextLine();

        System.out.println("Please enter your name: ");
        String forename = scanner.nextLine();

        System.out.println("Please enter your surname:");
        String surname = scanner.nextLine();

        System.out.println("Welcome" + forename + " " + surname);
    }
}
