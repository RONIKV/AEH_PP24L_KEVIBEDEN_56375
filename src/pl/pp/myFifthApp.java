package pl.pp;

public class myFifthApp {
    public static void main(String[] args) {
        printCharacter('X', 5, 3);
        int n = 6; //
        long startTime, endTime, iterativeTime, recursiveTime;

        startTime = System.nanoTime();
        long iterativeResult = iterativeFactorial(n);
        endTime = System.nanoTime();
        iterativeTime = endTime - startTime;

        startTime = System.nanoTime();
        long recursiveResult = recursiveFactorial(n);
        endTime = System.nanoTime();
        recursiveTime = endTime - startTime;

        System.out.println("Iterative Factorial of " + n + ": " + iterativeResult);
        System.out.println("Time taken for iterative factorial: " + iterativeTime + " nanoseconds");

        System.out.println("Recursive Factorial of " + n + ": " + recursiveResult);
        System.out.println("Time taken for recursive factorial: " + recursiveTime + " nanoseconds");
    }

    public static void printCharacter(char ch, int repeat, int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < repeat; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static long iterativeFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long recursiveFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * recursiveFactorial(n - 1);
        }
    }
}
