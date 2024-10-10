class Solution {
    public int maxWidthRamp(int[] nums) {
        // Stack to store indices in a decreasing order of values
        Stack<Integer> stack = new Stack<>();
        
        // Step 1: Build the decreasing stack
        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }

        // Step 2: Traverse from right to left to find the maximum ramp width
        int maxRamp = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            // Try to find the largest j such that nums[j] <= nums[i]
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                maxRamp = Math.max(maxRamp, i - stack.pop());
            }
        }
        
        return maxRamp;
    }
}
