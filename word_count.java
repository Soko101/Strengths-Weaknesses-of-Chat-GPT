import java.util.HashMap;
import java.util.Map;

public class Word_count {
    public static void main(String[] args) {
        String passage = "";

        // Create a HashMap to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Split the passage into individual words
        String[] words = passage.split("\\s+");

        // Count the occurrences of each word
        for (String word : words) {
            // Remove any punctuation marks from the word
            word = word.replaceAll("[^a-zA-Z0-9]", "");

            // Ignore empty words
            if (!word.isEmpty()) {
                // Convert the word to lowercase for case-insensitive counting
                word = word.toLowerCase();

                // Update the count for the word
                int count = wordCountMap.getOrDefault(word, 0);
                wordCountMap.put(word, count + 1);
            }
        }

        // Print the word counts
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
