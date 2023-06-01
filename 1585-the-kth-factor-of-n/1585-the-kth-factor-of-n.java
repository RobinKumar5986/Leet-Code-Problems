class Solution {
    public int kthFactor(int n, int k) {
        int factor;

        // Iterate from 1 to square root of n
        for (factor = 1; factor * factor < n; ++factor) {
            // Check if factor is a divisor of n and decrement k
            if (n % factor == 0 && --k == 0) {
               return factor;  // Return the kth factor
            }
        }

        // Iterate from square root of n to 1
        for (factor = (int) Math.sqrt(n); factor > 0; --factor) {
            // Check if n divided by factor is a divisor of n and decrement k
            if (n % (n / factor) == 0 && --k == 0) {
                return n / factor;  // Return the kth factor
            }
        }

        return -1;  // Kth factor does not exist, return -1
    }
}