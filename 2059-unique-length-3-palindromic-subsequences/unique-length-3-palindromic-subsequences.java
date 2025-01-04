class Solution {
    public int countPalindromicSubsequence(String s) {
        // Map to store unique characters between first and last occurrence of each character
        Map<Character, Set<Character>> map = new HashMap<>();
        int[] first = new int[26]; // To store the first occurrence of each character
        int[] last = new int[26];  // To store the last occurrence of each character
        Arrays.fill(first, -1);   // Initialize first occurrence to -1

        // Populate first and last occurrence arrays
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (first[c - 'a'] == -1) {
                first[c - 'a'] = i; // Set first occurrence
            }
            last[c - 'a'] = i; // Update last occurrence
        }

        // Populate the map with unique characters between first and last occurrence
        for (char c = 'a'; c <= 'z'; c++) {
            if (first[c - 'a'] != -1) { // If the character exists in the string
                Set<Character> uniqueChars = new HashSet<>();
                for (int i = first[c - 'a'] + 1; i < last[c - 'a']; i++) {
                    uniqueChars.add(s.charAt(i));
                }
                map.put(c, uniqueChars);
            }
        }

        // Calculate the result
        int ans = 0;
        for (Map.Entry<Character, Set<Character>> entry : map.entrySet()) {
            ans += entry.getValue().size();
        }
        return ans;
    }
}
