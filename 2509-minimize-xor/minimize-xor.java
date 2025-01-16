class Solution {
    public int minimizeXor(int n1, int n2) {
        int req = 0;
        while(n2 > 0){
            req += 1 & n2;
            n2 >>= 1;
        }
        int ans = 0;
        int pos = 0;
        for (pos = 31; pos >= 0; pos--) {
            int bit = (n1 >> pos) & 1;
            if (bit == 1 && req > 0) {
                ans |= (1 << pos);
                req--;
            }
        }
        int temp = ans;
        pos = 0;
        while(req > 0){
            int bit = temp & 1;
            if(bit == 0){
                ans |= (1 << pos);
                req--;
            }
            temp >>= 1;
            pos++;
        }
        return ans;
    }
}