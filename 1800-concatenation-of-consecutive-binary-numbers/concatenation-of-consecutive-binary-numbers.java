class Solution {

    public int concatenatedBinary(int n) {
        int mod = 1000_000_000 + 7;
        int ans = 1;
        for(int i = 2; i <= n ; i++) {
            int val = i;

            boolean bits[] = new boolean[32];
            int co = 0;
            while(val > 0) {
                int bit = val & 1;
                bits[co++] = bit == 1 ? true : false;
                val = val >> 1;
            }
            for(int j = co - 1; j >= 0 ; j--){
                int bit = bits[j] == true ? 1 : 0;
                ans = (( ans << 1) | bit ) % mod;
            }
            
        }
        return ans;
    }
}