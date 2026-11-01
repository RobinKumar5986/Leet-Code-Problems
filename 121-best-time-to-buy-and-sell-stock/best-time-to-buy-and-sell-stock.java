class Solution {
    public int maxProfit(int[] nums) {
        int max[] = new int[nums.length];
        int m = nums[nums.length-1];

        for(int i = nums.length-1; i >= 0; i--){
            m = Math.max(m,nums[i]);
            max[i] = m;
        }
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans = Math.max(ans,max[i]-nums[i]);
        }
        return ans;
    }
}