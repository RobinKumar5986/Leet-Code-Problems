class Solution {
    public long minimumSteps(String s) {
        long ans = 0;
        int ind = -1; // Keeps track of the index of the first '1'
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '1' && ind == -1) {
                ind = i; // Record the position of the first '1'
            }
            
            // If we have seen '1' before and encounter a '0', calculate the steps
            if (ind != -1 && c == '0') {
                ans += i - ind;
                ind++; // Move to the next '1' after processing this '0'
            }
        }
        
        return ans;
    }
}
