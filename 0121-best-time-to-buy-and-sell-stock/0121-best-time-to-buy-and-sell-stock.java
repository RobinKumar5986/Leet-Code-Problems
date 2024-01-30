class Solution {
    public int maxProfit(int[] nums) {
        int max=0;
        int buy=nums[0];
        for(int i=1;i<nums.length;i++){
            int diff=nums[i]-buy;
            if(diff>max){
                max=diff;
            }
            if(nums[i]<buy)buy=nums[i];
        }
        return max;
    }
}