class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int len = nums.length;
        while(len > 1){
            for(int i = 0; i < nums.length -1; i++){
                nums[i] = (nums[i] + nums[i+1]) % 10;
            }
            
            len--;
        }
        return nums[0];
    }
}