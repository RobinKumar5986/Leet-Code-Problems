class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;

        int n = nums.length;
        Arrays.sort(nums);
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxLen = 1;
        int lastNum = nums[0];

        // Step 1: Find dp[i] and max value
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                lastNum = nums[i];
            }
        }

        // Step 2: Reconstruct by scanning backwards
        int currentLen = maxLen;
        int currentNum = lastNum;

        for (int i = n - 1; i >= 0 && currentLen > 0; i--) {
            if (currentNum % nums[i] == 0 && dp[i] == currentLen) {
                result.add(nums[i]);
                currentNum = nums[i];
                currentLen--;
            }
        }

        return result;
    }
}
