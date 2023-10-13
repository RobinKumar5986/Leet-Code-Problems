class Solution {
    public int maxProfit(int[] nums) {
        int pr=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                pr+=nums[i]-nums[i-1];
            }
        }
        return pr;

    }
}