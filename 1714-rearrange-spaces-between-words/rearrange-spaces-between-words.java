import java.util.*;

class Solution {
    public String reorderSpaces(String text) {
        List<String> words = new ArrayList<>();
        int spaceCount = 0, n = text.length();
        
        // Collect words and count spaces
        StringBuilder word = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0); // Reset StringBuilder
                }
            } else {
                word.append(c);
            }
        }
        if (word.length() > 0) {
            words.add(word.toString());
        }

        // If only one word, all spaces go to the end
        if (words.size() == 1) {
            return words.get(0) + " ".repeat(spaceCount);
        }

        // Distribute spaces evenly
        int spaceBetween = spaceCount / (words.size() - 1);
        int spaceEnd = spaceCount % (words.size() - 1);

        // Build the final result
        StringBuilder result = new StringBuilder(n);
        String separator = " ".repeat(spaceBetween);
        
        for (int i = 0; i < words.size(); i++) {
            result.append(words.get(i));
            if (i < words.size() - 1) {
                result.append(separator);
            }
        }
        result.append(" ".repeat(spaceEnd));

        return result.toString();
    }
}
