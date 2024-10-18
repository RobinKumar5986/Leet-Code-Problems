class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int maxOr = 0;
        int count = 0;

        // Calculate the maximum possible OR value
        for (int num : nums) {
            maxOr |= num;
        }

        // Iterate over all possible subsets using bit manipulation
        int totalSubsets = 1 << n; // 2^n subsets
        for (int mask = 0; mask < totalSubsets; mask++) {
            int currentOr = 0;

            // For each subset, calculate the OR value
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) { // Check if the i-th element is in the subset
                    currentOr |= nums[i];
                }
            }

            // If the current OR equals the maximum OR, increment the count
            if (currentOr == maxOr) {
                count++;
            }
        }

        return count;
    }
}
