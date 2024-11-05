class Solution {
    public int minChanges(String s) {
        int changes = 0;
        for (int i = 0; i < s.length() - 1; i += 2) {
            if (s.charAt(i)-'0' != s.charAt(i + 1)-'0') {
                changes++;
            }
        }
        return changes;
    }
}
