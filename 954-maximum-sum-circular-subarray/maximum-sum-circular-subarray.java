class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int sum = 0;

        int c1 = 0;
        int c2 = 0;
        for(int ele : nums){
            c1 += ele;
            c2 += ele;
            sum += ele;

            max = Math.max(max,c1);
            if(c1 < 0) c1 = 0;

            min = Math.min(min,c2);
            if(c2 > 0) c2 = 0;
        }
        if(max < 0 && min < 0 && sum < 0)
            return max;
        int ans = Math.max(max, sum - min);
        return ans;
    }
}