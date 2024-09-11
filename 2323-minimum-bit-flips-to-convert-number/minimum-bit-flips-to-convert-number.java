class Solution {
    public int minBitFlips(int start, int goal) {
        int max = Math.max(start,goal);
        int len = Integer.toBinaryString(max).length()-1;
        int ans = 0;
        while(len >=0){
            int b1 = start  & 1;
            int b2 = goal & 1;
            start = start >> 1;
            goal = goal >> 1;
            if(b1 != b2)
                ans++; 
            len--;
        }
        return ans;
    }
}