class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0)
            return 1;
            
        int ans = 0;
        int pow = 0;
        while(n > 0){
            int t = n & 1;
            if(t == 0){
                ans += 1 << pow;
            }
            pow++;
            n = n>>1;
        }
        return ans;
    }
}