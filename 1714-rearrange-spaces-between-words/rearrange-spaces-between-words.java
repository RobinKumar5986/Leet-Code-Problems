class Solution {
    public String reorderSpaces(String text) {
        // Count spaces and collect words in one pass
        int spaces = 0;
        String[] words = text.trim().split("\\s+");
        
        // If no words or empty string, return original
        if (words.length == 0 || (words.length == 1 && words[0].isEmpty())) {
            return text;
        }
        
        // Count total spaces
        for (char c : text.toCharArray()) {
            if (c == ' ') spaces++;
        }
        
        // If no spaces, return original
        if (spaces == 0) return text;
        
        StringBuilder result = new StringBuilder();
        
        // If only one word, append it with all spaces
        if (words.length == 1) {
            return words[0] + " ".repeat(spaces);
        }
        
        // Calculate spaces between words and remaining spaces
        int spacesBetween = spaces / (words.length - 1);
        int extraSpaces = spaces % (words.length - 1);
        
        // Build result
        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if (i < words.length - 1) {
                result.append(" ".repeat(spacesBetween));
            }
        }
        
        // Append remaining spaces
        result.append(" ".repeat(extraSpaces));
        
        return result.toString();
    }
}