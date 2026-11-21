class Solution {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        int i = 0;
        for(i = 0 ; i <= max && i < nums.length ; i++){
            max = Math.max(max,i + nums[i]);
            if(i == nums.length-1){
                return true;
            }
        }
        return false;
    }
}