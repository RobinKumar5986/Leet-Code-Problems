class Solution {
    public int[] applyOperations(int[] nums) {
        int[] ans = new int[nums.length];
        int ind = 0;
        for(int i = 0 ; i < nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
            if(nums[i] != 0){
                ans[ind++] = nums[i];
            }
        }
        if(nums[nums.length-1] != 0){
            ans[ind] = nums[nums.length-1];
        }
        return ans;
    }
}