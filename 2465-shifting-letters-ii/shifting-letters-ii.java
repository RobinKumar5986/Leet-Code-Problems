class Solution {
    public String shiftingLetters(String s, int[][] sh) {
        int n = s.length();
        int[] shift = new int[n + 1]; // Difference array with an extra space

        // Apply the difference array logic
        for (int[] ele : sh) {
            int start = ele[0];
            int end = ele[1];
            int direction = ele[2] == 0 ? -1 : 1; // 0 for left, 1 for right

            shift[start] += direction;
            if (end + 1 < n) {
                shift[end + 1] -= direction;
            }
        }

        // Calculate the prefix sum to get the net shifts
        int cumulativeShift = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            cumulativeShift = (cumulativeShift + shift[i]) % 26; // Modulo to keep within bounds
            if (cumulativeShift < 0) {
                cumulativeShift += 26; // Handle negative shifts
            }

            // Apply the shift to the current character
            char newChar = (char) ((s.charAt(i) - 'a' + cumulativeShift) % 26 + 'a');
            sb.append(newChar);
        }

        return sb.toString();
    }
}
