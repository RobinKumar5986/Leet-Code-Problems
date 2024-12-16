import java.util.*;

class Solution {
    int mod = 1_000_000_007;

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        // If multiplier is 1, no changes need to be made
        if (multiplier == 1) {
            return nums;
        }
        
        // PriorityQueue to maintain the smallest value with its index
        Queue<long[]> q = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0]) return Long.compare(a[0], b[0]);
                return Long.compare(a[1], b[1]);
            }
        );
        
        // Add all elements to the queue with their indices
        for (int i = 0; i < nums.length; i++) {
            q.add(new long[]{nums[i], i});
        }
        
        // Find the maximum value in the array
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        // Apply the multiplier while possible
        while (k > 0 && max / q.peek()[0] >= multiplier) {
            long[] n = q.poll();
            n[0] = (n[0] * multiplier) % mod;  // Multiply and apply modulo
            nums[(int) n[1]] = (int) n[0];  // Update the value in the original array
            q.add(n);  // Re-add the updated element to the queue
            k--;
        }

        // If there are still remaining operations after full cycles, handle them
        int times = k / nums.length;  // Full cycles
        int rem = k % nums.length;    // Remaining operations
        
        int[] result = new int[nums.length];
        
        // Calculate powers using exponentiation by squaring
        long first = powerSum(multiplier, times, mod);
        long second = powerSum(multiplier, times + 1, mod);
        
        // Process the remaining operations
        while (!q.isEmpty()) {
            long[] n = q.poll();
            long val = rem-- > 0 ? second : first;
            val = (val * n[0]) % mod;
            result[(int) n[1]] = (int) val;
        }

        return result;
    }

    // Efficient power calculation using exponentiation by squaring
    private long powerSum(long a, long b, int mod) {
        long result = 1;
        long base = a;

        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            b /= 2;
        }

        return result;
    }
}
