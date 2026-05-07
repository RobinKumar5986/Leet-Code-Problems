class Solution {
    public boolean canJump(int[] nums) {

        int max = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0 && max <= i && i != nums.length - 1){
                return false;
            }
            int val = nums[i] + i;
            max = Math.max(max,val);
        }
        return true;
    }
}