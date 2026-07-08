class Solution {
    int mod = 1_000_000_000 + 7;

    public int[] sumAndMultiply(String s, int[][] queries) {
        
        int len = s.length();
        int[] ans = new int[queries.length];
        long[] numX = new long[len+1];
        long[] pxSum = new long[len+1];
        int[] cnt = new int[len + 1];

        //prefix calculation
        for(int i = 1 ; i < len+1 ; i++){
            int n = s.charAt(i-1) - '0';
            pxSum[i] = (pxSum[i-1] + n)%mod;
            if(n == 0 ){
                numX[i] = numX[i-1];
                cnt[i] = cnt[i-1];
                continue;
            }
            numX[i] = (( numX[i-1]  * 10)%mod + n)%mod;
            cnt[i] = cnt[i-1]+1;
        }
        for(int i = 0 ; i < queries.length ; i++){
            int lo = queries[i][0];
            int hi = queries[i][1];

            long rawSum = pxSum[hi + 1] - pxSum[lo];
            long sum = ((rawSum % mod) + mod) % mod; 
            
            int diff = cnt[hi + 1] - cnt[lo];
            long shift = modPow(10, diff, mod);
            long shiftedPrefix = (numX[lo] * shift) % mod;
            long rawX = numX[hi + 1] - shiftedPrefix;
            long x = ((rawX % mod) + mod) % mod;

            long result = (x * sum) % mod;
            ans[i] = (int) result;
        }
        return ans;

    }
    public long modPow(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}