class Solution {
    public long minEnd(int n, int x) {
        n = n - 1;
        long ans = x;
        int pos = 0;
        while(n != 0){
            int bit =  (int)((ans >> pos) & 1L);
            if(bit == 0){
                int mask = n & 1;
                if(mask == 1){
                    ans |= (1L << pos);
                }
                n >>= 1;
            }
            pos++;
        }
        return ans;
    }
}