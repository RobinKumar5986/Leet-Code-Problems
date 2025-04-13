class Solution {
    public int countGoodNumbers(long n) {
        if(n == 1)
            return 5;
        int mod = 1000_000_007;
        long p4 = n / 2; 
        long p5 = (n + 1) / 2; 
        long pow5 = modPow(5, p5, mod);
        long pow4 = modPow(4, p4, mod);  
        long ans = (pow5 * pow4) % mod; 
        return (int)ans;
    }
    private long modPow(long base, long exp, int mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp = exp >> 1; //similar to n/2;
        }
        return result;
    }
}