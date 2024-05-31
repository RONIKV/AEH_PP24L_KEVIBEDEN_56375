import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class myTwelfthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFilePath = null;
        String outputFilePath = null;


        while (true) {
            System.out.print("Please enter the path to the input text file: ");
            inputFilePath = scanner.nextLine();

            if (inputFilePath == null || inputFilePath.trim().isEmpty()) {
                System.out.println("Input file path cannot be empty. Please try again.");
                continue;
            }

            try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
                break;
            } catch (FileNotFoundException e) {
                System.out.println("The file does not exist. Please enter a valid file path.");
            } catch (IOException e) {
                System.out.println("An error occurred while accessing the file. Please try again.");
            }
        }


        while (true) {
            System.out.print("Please enter the path to the output text file: ");
            outputFilePath = scanner.nextLine();

            if (outputFilePath == null || outputFilePath.trim().isEmpty()) {
                System.out.println("Output file path cannot be empty. Please try again.");
                continue;
            }

            break;
        }


        int lineCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            while (br.readLine() != null) {
                lineCount++;
            }
            System.out.println("The number of lines in the input file: " + lineCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the input file.");
            e.printStackTrace();
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
            bw.write("Input file: " + inputFilePath + "\n");
            bw.write("Number of lines: " + lineCount + "\n");
            System.out.println("The result has been saved to the output file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the output file.");
            e.printStackTrace();
        }
    }
}
