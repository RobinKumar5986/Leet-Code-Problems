import java.util.HashMap;
import java.util.Map;

class Solution {
    int max = 0;
    int count = 0;
    Map<String, Integer> memo = new HashMap<>();

    void subset(int[] nums, int cur, int ind) {
        // Prune: If current OR value already equals max, no need to continue
        if (cur == max) {
            count += (1 << (nums.length - ind));  // Count all remaining subsets
            return;
        }
        
        // If we've reached the end of the array
        if (ind == nums.length) {
            if (cur == max) count++;
            return;
        }

        // Memoization to avoid repeated calculations
        String key = cur + "," + ind;
        if (memo.containsKey(key)) {
            count += memo.get(key);
            return;
        }

        int initialCount = count;

        // Option 1: Do not include the current element
        subset(nums, cur, ind + 1);
        
        // Option 2: Include the current element
        subset(nums, cur | nums[ind], ind + 1);

        // Store the result in memo
        memo.put(key, count - initialCount);
    }

    public int countMaxOrSubsets(int[] nums) {
        // Compute the maximum possible OR value
        for (int ele : nums)
            max = max | ele;
        
        // Start the subset generation and counting
        subset(nums, 0, 0);
        
        return count;
    }
}
