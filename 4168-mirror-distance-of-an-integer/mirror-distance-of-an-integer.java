class Solution {
    public int mirrorDistance(int n) {
        int copy = n;
        int rev = 0;
        while(n > 0 ){
            int rem = n % 10;
            n = n/10;
            rev = rev *  10 + rem;
        }
        return Math.abs(copy - rev);
    }
}