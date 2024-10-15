class Solution {
    public long minimumSteps(String s) {
        long ans = 0;
        int ind = -1;
        int i = 0; 
        for (char c : s.toCharArray()) {
            if (ind == -1 && c == '0') {
                i++;
                continue;
            }
            if (c == '1' && ind == -1) {
                ind = i;
            }
            if (c == '0') {
                ans += i - ind;
                ind++;
            }
            i++;
        }
        return ans;
    }
}
