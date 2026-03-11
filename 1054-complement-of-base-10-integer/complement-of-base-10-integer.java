class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        int len = 0;
        int temp = n;
        while(temp > 0) {
            temp = temp >> 1;
            len++;
        }
        int ans = 0;
        int ind = 0;
        while(ind < len) {
            int bit = (n >> ind ) & 1;
            //fliping the bit
            bit = bit == 0 ? 1 : 0;
            ans = (bit << ind) | ans;
            ind++;
        }
        return ans;
    }
}