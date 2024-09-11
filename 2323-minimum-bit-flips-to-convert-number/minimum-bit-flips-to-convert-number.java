class Solution {
    public int minBitFlips(int start, int goal) {
        int len = start ^ goal;
        int ans = 0;
        while(len > 0){
            ans += len & 1;
            len = len >> 1;
        }
        return ans;
    }
}