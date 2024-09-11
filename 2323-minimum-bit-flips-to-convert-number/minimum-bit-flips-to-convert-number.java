class Solution {
    public int minBitFlips(int start, int goal) {
        int len = start ^ goal;
        int ans = 0;
        while(len > 0){
            int b1 = start  & 1;
            int b2 = goal & 1;
            start = start >> 1;
            goal = goal >> 1;
            if(b1 != b2)
                ans++; 
            len = len >> 1;
        }
        return ans;
    }
}