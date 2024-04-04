
import java.util.HashMap;

public class wordcounter3 {
    public static void main(String[] args) {
        String text = "Hello, how are you? This is a sample text with some words.";
        HashMap<String, Integer> wordCount = new HashMap<>();

        String[] words = text.split("\\s+");

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("Word Counts:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
