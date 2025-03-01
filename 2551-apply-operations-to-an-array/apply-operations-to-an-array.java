class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length];
        int ind = 0;
        for(int i = 0 ; i < nums.length;i++){
            if(i+1 < n && nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
            if(nums[i] != 0){
                ans[ind++] = nums[i];
            }
        }
        return ans;
    }
}