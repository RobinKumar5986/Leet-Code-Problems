import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countMaxOrSubsets(int[] nums) {
        // Calculate the maximum possible OR value
        int maxOr = 0;
        for (int num : nums) {
            maxOr |= num;
        }

        // DP map to store how many subsets have each OR value
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 1); // Initially, there's 1 subset with OR value 0 (the empty subset)

        // Iterate through each number in the array
        for (int num : nums) {
            Map<Integer, Integer> newDp = new HashMap<>(dp); // Create a copy of dp

            // Update dp based on current number and existing subsets
            for (int orVal : dp.keySet()) {
                int newOrVal = orVal | num;
                newDp.put(newOrVal, newDp.getOrDefault(newOrVal, 0) + dp.get(orVal));
            }

            dp = newDp; // Move to the updated dp map
        }

        // The result is how many subsets achieve the maximum OR value
        return dp.getOrDefault(maxOr, 0);
    }
}
