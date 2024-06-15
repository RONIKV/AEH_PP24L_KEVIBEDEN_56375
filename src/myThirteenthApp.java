import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class myThirteenthApp{

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputFilename = getInputFilename(reader);
        String outputFilename = getOutputFilename(reader);

        if (!Files.exists(Paths.get(inputFilename))) {
            System.out.println("Error: File '" + inputFilename + "' not found.");
            return;
        }

        Map<String, Integer> wordCounts = new HashMap<>();
        int totalWords = 0;

        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFilename))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.toLowerCase(); // Küçük harfe çevir
                    if (!word.isBlank()) { // Boşluk olmayan kelimeleri say
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                        totalWords++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("Total number of words in the file: " + totalWords);
        System.out.println("Word Counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFilename))) {
            fileWriter.write("Filename: " + Paths.get(inputFilename).getFileName() + "\n");
            fileWriter.write("Total words: " + totalWords + "\n\n");
            fileWriter.write("Word Counts:\n");
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                fileWriter.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
            System.out.println("Results saved in " + outputFilename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static String getInputFilename(BufferedReader reader) {
        System.out.print("Enter the path to the input text file: ");
        try {
            return reader.readLine().trim();
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
            return "";
        }
    }

    private static String getOutputFilename(BufferedReader reader) {
        System.out.print("Enter the path to the output file: ");
        try {
            return reader.readLine().trim();
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
            return "";
        }
    }
}

