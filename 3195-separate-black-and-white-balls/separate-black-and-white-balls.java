class Solution {
    public long minimumSteps(String s) {
        long ans = 0;
        int onesCount = 0; // Tracks the number of '1's we've encountered

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                onesCount++;
            } else if (onesCount > 0) {
                ans += onesCount; 
            }
        }

        return ans;
    }
}
