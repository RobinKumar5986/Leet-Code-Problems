class Solution {
    public long removeZeros(long n) {
        long ans = 0;
        long mul = 1;
        while(n > 0){
            long rem = n % 10;
            n = n/10;
            if(rem != 0){
                ans = rem * mul + ans;
                mul = mul * 10;
            }
        }
        return ans;
    }
}