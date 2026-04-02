import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
public class WordFrequencyAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) return;
        String input = scanner.nextLine();
        String cleanedInput = input.toLowerCase().replaceAll("[^a-z0-9\\s]", "");
        String[] words = cleanedInput.trim().split("\\s+");
        Map<String, Integer> wordCounts = new TreeMap<>();
        if (input.trim().isEmpty()) {
            System.out.println("Word Frequency Report:");
            System.out.println("Total Unique Words: 0");
            return;
        }
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println("Word Frequency Report:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Total Unique Words: " + wordCounts.size());

        scanner.close();
    }
}
