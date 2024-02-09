class Solution {

    //By chat GPT -- > do it aggain when you lean dp

    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        
        List<Integer>[] dp = new ArrayList[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = new ArrayList<>();
        }

        dp[0].add(nums[0]);
        List<Integer> result = dp[0];

        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0 && dp[i].size() < dp[j].size()) {
                    dp[i] = new ArrayList<>(dp[j]);
                }
            }

            dp[i].add(nums[i]);

            if (dp[i].size() > result.size()) {
                result = dp[i];
            }
        }

        return result;
    }
}
