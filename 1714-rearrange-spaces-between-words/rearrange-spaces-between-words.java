class Solution {
    public String reorderSpaces(String text) {
        int length = text.length();
        int wordCount = 0;
        int spaceCount = 0;
        
        // Single pass to count words and spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            } else if (i == 0 || text.charAt(i - 1) == ' ') {
                wordCount++;
            }
        }
        
        // Edge cases
        if (spaceCount == 0) return text;
        if (wordCount == 1) {
            return text.trim() + " ".repeat(spaceCount);
        }
        
        // Calculate spacing
        int gapSpaces = spaceCount / (wordCount - 1);
        int extraSpaces = spaceCount % (wordCount - 1);
        
        // Build result in one pass
        char[] result = new char[length];
        int writePos = 0;
        int readPos = 0;
        
        // Skip leading spaces
        while (text.charAt(readPos) == ' ') readPos++;
        
        // Process words and gaps
        for (int w = 0; w < wordCount; w++) {
            // Copy word
            while (readPos < length && text.charAt(readPos) != ' ') {
                result[writePos++] = text.charAt(readPos++);
            }
            
            // Add spaces (except after last word)
            if (w < wordCount - 1) {
                for (int s = 0; s < gapSpaces; s++) {
                    result[writePos++] = ' ';
                }
            }
            
            // Skip spaces between words
            while (readPos < length && text.charAt(readPos) == ' ') readPos++;
        }
        
        // Add remaining spaces
        while (writePos < length) {
            result[writePos++] = ' ';
        }
        
        return new String(result);
    }
}